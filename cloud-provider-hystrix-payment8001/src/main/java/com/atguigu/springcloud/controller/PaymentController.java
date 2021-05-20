package com.atguigu.springcloud.controller;/*
 * @AUTHOR   LiXiang
 * @Classname PaymentController
 *
 * @Date 2021/5/19 下午8:24
 *

 * @userName
 */

import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

     @Value("${server.port}")
    private String serverPort;

     @GetMapping("/payment/hystrix/ok/{id}")
     public String PaymentInfo_OK(@PathVariable("id") Integer id){

         String result = paymentService.PaymentInfo_OK(id);
         log.info("ok 方法 result: "+result);

         return result;

     }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String PaymentInfo_TimeOut(@PathVariable("id") Integer id){

        String result = paymentService.PaymentInfo_TimeOut(id);
        log.info("ok 方法 result: "+result);

        return result;

    }



}
