package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author feifan
 * @email 376496965@qq.com
 * @date 2020-12-16 23:00:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
