package xyz.itihub.distributedtransaction.localmsg.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.itihub.distributedtransaction.localmsg.service.OrderService;

/**
 * 订单系统
 */
@RequiredArgsConstructor
@RestController
public class OrderController {

    private final OrderService orderService;

    /**
     * 订单支付回调接口
     * @param orderId
     * @return
     */
    @RequestMapping("handleOrder")
    public String handleOrder(String orderId){
        try {
            int result = orderService.handleOrder(Integer.valueOf(orderId));
            if (result == 0) return "success";
        }catch (Exception e){
            e.printStackTrace();
        }

        return "fail";
    }
}
