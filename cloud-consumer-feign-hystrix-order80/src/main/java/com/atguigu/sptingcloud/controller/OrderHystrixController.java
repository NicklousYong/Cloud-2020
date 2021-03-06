package com.atguigu.sptingcloud.controller;
/*
 * @AUTHOR   LiXiang
 * @Classname Coontroller
 *
 * @Date 2021/5/19 下午10:07
 *
 * @userName
 */

import com.atguigu.sptingcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;


    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){

        return  paymentHystrixService.paymentInfo_OK(id);

    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id){
        return  paymentHystrixService.paymentInfo_timeout(id);
    }

}
