package com.atguigu.sptingcloud;/*
 * @AUTHOR   LiXiang
 * @Classname OrderHystrixMain
 *
 * @Date 2021/5/19 下午10:04
 *

 * @userName
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderHystrixMain80 {


    public static void main(String[] args){
        SpringApplication.run(OrderHystrixMain80.class,args);
    }

}
