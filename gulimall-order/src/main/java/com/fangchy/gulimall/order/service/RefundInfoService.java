package com.fangchy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fangchy.common.utils.PageUtils;
import com.fangchy.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author fangchy
 * @email 1013659102@qq.com
 * @date 2021-05-19 14:06:42
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

