package com.fangchy.gulimall.coupon;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fangchy.gulimall.coupon.entity.CouponEntity;
import com.fangchy.gulimall.coupon.service.CouponService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Autowired
    CouponService couponService;

    @Test
    void contextLoads() {

        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setId(1L);
        couponEntity.setCouponName("满10000减1");

        couponService.updateById(couponEntity);
        //couponService.save(couponEntity);
        Wrapper queryWrapper = new QueryWrapper<>(couponEntity);
        couponService.remove(queryWrapper);

        System.out.println("执行成功....");
    }

}
