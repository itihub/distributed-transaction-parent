package xyz.itihub.distributedtransaction.localmsg.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.itihub.distributedtransaction.localmsg.dao203.mapper.OrderMapper;
import xyz.itihub.distributedtransaction.localmsg.dao203.model.Order;

import javax.annotation.Resource;
import java.util.Date;

@RequiredArgsConstructor
@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;

    /**
     * 订单回调接口
     * @param orderId
     * @return  0:成功 1:订单不存在
     */
    public int handleOrder(int orderId){
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) return 1;
        order.setOrderStatus(1);    // 已支付
        order.setUpdateTime(new Date());
        order.setUpdateUser(0);
        orderMapper.updateByPrimaryKey(order);

        return 0;
    }
}
