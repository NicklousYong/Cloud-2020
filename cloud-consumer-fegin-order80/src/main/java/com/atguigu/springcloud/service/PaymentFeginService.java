package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeginService {

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value="/payment/feign/timeout")
    public String paymentFeignTimeout();

/**
 *Feign的value绑定了微服务的名称，再从Controller中找到请求地址
 * 调用过程：    OrderFeginController 调用 PaymentFeginService 而PaymentFeignService上依据
 * @FeignClient(value = "CLOUD-PAYMENT-SERVICE")标注服务来对服务方（8001，8002）进行调用
 * ，又由17行的代码调用到 @GetMapping(value="/payment/feign/timeout") 的aymentFeignTimeout方法，
 * 在方法体内执行成功。
 *
 *
 */


}
