package com.fangchy.gulimall.member.dao;

import com.fangchy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fangchy
 * @email 1013659102@qq.com
 * @date 2021-05-19 14:13:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
