package xyz.itihub.distributedtransaction.localmsg.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.itihub.distributedtransaction.localmsg.service.PaymentService;

import java.math.BigDecimal;

/**
 * 支付系统
 */
@RequiredArgsConstructor
@RestController
public class PaymentController {

    private final PaymentService paymentService;

    /**
     * 订单支付接口
     * @param userId
     * @param orderId
     * @param amount
     * @return
     */
    @RequestMapping(value = "payment")
    public String payment(int userId, int orderId, BigDecimal amount){
        int result = paymentService.payment(userId, orderId, amount);
        return "支付结果：" + result;
    }
}
