package com.fangchy.gulimall.order;

import com.fangchy.gulimall.order.entity.OrderEntity;
import com.fangchy.gulimall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    void contextLoads() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setReceiverName("fangchy");
        orderService.save(orderEntity);
        System.out.println("执行成功....");
    }

}
