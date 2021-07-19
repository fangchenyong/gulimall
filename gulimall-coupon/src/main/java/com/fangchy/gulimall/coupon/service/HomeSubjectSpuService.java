package com.fangchy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fangchy.common.utils.PageUtils;
import com.fangchy.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author fangchy
 * @email 1013659102@qq.com
 * @date 2021-05-19 09:44:32
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

