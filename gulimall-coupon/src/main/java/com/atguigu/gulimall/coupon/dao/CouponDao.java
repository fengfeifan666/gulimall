package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author feifan
 * @email 376496965@qq.com
 * @date 2020-12-16 22:48:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
