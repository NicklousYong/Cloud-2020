package com.atguigu.springcloud.service;/*
 * @AUTHOR   LiXiang
 * @Classname PaymentService
 *
 * @Date 2021/5/19 下午8:17
 *

 * @userName
 */

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String PaymentInfo_OK(Integer id){

        return "线程池：  "+Thread.currentThread().getName()+
                "paymentInfo_OK,id: "+id+"\t"+"hahahha";
    }

    public String PaymentInfo_TimeOut(Integer id){
        //线程睡眠3秒
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程池：  "+Thread.currentThread().getName()+
                "paymentInfo_OK,id: "+id+"\t"+"hahahha"+" 此处耗时3秒钟  ";

    }


}
