package com.atguigu.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //类似404
    private  Integer code;
    //具体信息
    private String  message;
    //根据传入对象设计数据
    private     T      data;

public CommonResult(Integer code,String message) {

    this(code,message,null);

}

}
