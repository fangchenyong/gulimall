package com.fangchy.gulimall.ware;

import com.fangchy.gulimall.ware.entity.PurchaseEntity;
import com.fangchy.gulimall.ware.service.PurchaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWareApplicationTests {

    @Autowired
    PurchaseService purchaseService;

    @Test
    void contextLoads() {

        PurchaseEntity purchaseEntity = new PurchaseEntity();
        purchaseEntity.setAssigneeName("fangchy");
        purchaseService.save(purchaseEntity);
        System.out.println("执行成功...");

    }

}
