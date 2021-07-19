package com.fangchy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fangchy.common.utils.PageUtils;
import com.fangchy.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author fangchy
 * @email 1013659102@qq.com
 * @date 2021-05-19 09:44:33
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

