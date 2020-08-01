package xyz.itihub.distributedtransaction.localmsg.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.itihub.distributedtransaction.localmsg.dao202.mapper.AccountMapper;
import xyz.itihub.distributedtransaction.localmsg.dao202.mapper.PaymentMsgMapper;
import xyz.itihub.distributedtransaction.localmsg.dao202.model.Account;
import xyz.itihub.distributedtransaction.localmsg.dao202.model.PaymentMsg;

import java.math.BigDecimal;
import java.util.Date;

@RequiredArgsConstructor
@Service
public class PaymentService {

    private final AccountMapper accountMapper;

    private final PaymentMsgMapper paymentMsgMapper;

    /**
     * 支付接口
     * @param userId
     * @param orderId
     * @param amount
     * @return 0:成功 1:用户不存在 2:余额不足
     */
    @Transactional(transactionManager = "db202TransactionManager", rollbackFor = Exception.class)
    public int payment(int userId, int orderId, BigDecimal amount){
        // 支付操作
        Account account = accountMapper.selectByPrimaryKey(userId);
        if (account == null) return 1;
        if(account.getBalance().compareTo(amount) < 0) return 2;

        account.setBalance(account.getBalance().subtract(amount));
        accountMapper.updateByPrimaryKey(account);

        // 记录本地消息表
        PaymentMsg paymentMsg = new PaymentMsg();
        paymentMsg.setOrderId(orderId);
        paymentMsg.setStatus(0);    // 未发送
        paymentMsg.setFalureCnt(0);     // 失败次数
        paymentMsg.setCreateTime(new Date());
        paymentMsg.setCreateUser(userId);
        paymentMsg.setUpdateTime(new Date());
        paymentMsg.setUpdateUser(userId);
        paymentMsgMapper.insertSelective(paymentMsg);

        return 0;
    }
}
