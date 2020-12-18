package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /*
    查询用户的优惠劵信息
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
