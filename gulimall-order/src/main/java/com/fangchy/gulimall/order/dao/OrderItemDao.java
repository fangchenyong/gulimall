package com.fangchy.gulimall.order.dao;

import com.fangchy.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author fangchy
 * @email 1013659102@qq.com
 * @date 2021-05-19 14:06:42
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
