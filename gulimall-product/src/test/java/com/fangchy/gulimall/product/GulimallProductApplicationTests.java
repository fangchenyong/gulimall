package com.fangchy.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fangchy.gulimall.product.entity.BrandEntity;
import com.fangchy.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        //brandEntity.setName("华为1");
        //brandService.save(brandEntity);
        //brandService.updateById(brandEntity);
        Wrapper queryWrapper = new QueryWrapper(brandEntity);
        brandService.remove(queryWrapper);

        System.out.println("删除成功....");
    }

}
