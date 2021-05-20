package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.entities.Student;
import com.atguigu.springcloud.service.PaymentService;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Time;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result  = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if (result>0)

                return new CommonResult(200,"插入数据成功,serverport: "+serverPort,result);

        return new CommonResult(500 ,"插入数据失败，请重试！！！,serverport: "+serverPort,null);
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment  = paymentService.getPaymentById(id);
        if (payment != null)

                return new CommonResult(200,"获取ID成功！！！"+payment);

        return new CommonResult(500,"根据ID："+id+"获取Payment失败，请重试！！！"+null);


    }


    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("element: "+ service);
        }

        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("cloud-payment-service".toUpperCase());
        for (ServiceInstance serviceInstance : serviceInstances) {
            log.info(serviceInstance.getServiceId()+"\t"+serviceInstance.getHost()+"\t"+serviceInstance.getUri());
        }

        return null;
    }

    @GetMapping(value="/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //暂停几秒钟线程
        try{ TimeUnit.SECONDS.sleep(3); }catch (Exception e){ e.printStackTrace();
        }
        return serverPort;
    }

}
