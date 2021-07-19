package com.fangchy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fangchy.common.utils.PageUtils;
import com.fangchy.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author fangchy
 * @email 1013659102@qq.com
 * @date 2021-05-19 14:06:42
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

