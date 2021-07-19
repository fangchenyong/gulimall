package com.fangchy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fangchy.common.utils.PageUtils;
import com.fangchy.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author fangchy
 * @email 1013659102@qq.com
 * @date 2021-05-18 22:24:04
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

