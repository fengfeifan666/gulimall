package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author feifan
 * @email 376496965@qq.com
 * @date 2020-12-16 23:04:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
