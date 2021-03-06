package com.atguigu.springcloud.controller;



import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result  = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if (result>0)

                return new CommonResult(200,"插入数据成功",result);

        return new CommonResult(500 ,"插入数据失败，请重试！！！",null);
    }



    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment  = paymentService.getPaymentById(id);
        if (payment != null)

                return new CommonResult(200,"获取ID成功！！！"+payment);

        return new CommonResult(500,"根据ID："+id+"获取Payment失败，请重试！！！"+null);


    }


}
