package xyz.itihub.distributedtransaction.localmsg.service;

import lombok.RequiredArgsConstructor;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.itihub.distributedtransaction.localmsg.dao202.mapper.PaymentMsgMapper;
import xyz.itihub.distributedtransaction.localmsg.dao202.model.PaymentMsg;
import xyz.itihub.distributedtransaction.localmsg.dao202.model.PaymentMsgExample;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderScheduler {

    private final PaymentMsgMapper paymentMsgMapper;

    @Scheduled(cron = "0/10 * * * * ?")
    public void orderNotify() throws IOException {
        PaymentMsgExample paymentMsgExample = new PaymentMsgExample();
        paymentMsgExample.createCriteria().andStatusEqualTo(0); // 查询未发送的消息

        List<PaymentMsg> paymentMsgList = paymentMsgMapper.selectByExample(paymentMsgExample);

        if (CollectionUtils.isEmpty(paymentMsgList)) return;

        for (PaymentMsg paymentMsg : paymentMsgList) {
            Integer orderId = paymentMsg.getOrderId();

            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost httpPost = new HttpPost("http://localhost:8080/handleOrder");
            NameValuePair orderIdPair = new BasicNameValuePair("orderId", String.valueOf(orderId));
            List<NameValuePair> list = Arrays.asList(orderIdPair);
            HttpEntity httpEntity = new UrlEncodedFormEntity(list);
            httpPost.setEntity(httpEntity);

            CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
            String str = EntityUtils.toString(httpResponse.getEntity());

            if ("success".equalsIgnoreCase(str)){
                paymentMsg.setStatus(1);    // 发送成功
            }else {
                Integer falureCnt = paymentMsg.getFalureCnt();
                falureCnt ++;
                paymentMsg.setFalureCnt(falureCnt);
                if (falureCnt > 5){
                    paymentMsg.setStatus(2);    // 失败
                }
            }
            paymentMsg.setUpdateTime(new Date());
            paymentMsg.setUpdateUser(0);
            paymentMsgMapper.updateByPrimaryKeySelective(paymentMsg);
        }
    }
}
