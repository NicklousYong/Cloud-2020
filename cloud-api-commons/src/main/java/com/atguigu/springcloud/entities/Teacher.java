package com.atguigu.springcloud.entities;/*
 * @AUTHOR   LiXiang
 * @Classname Teacher
 *
 * @Date 2021/5/19 上午11:15
 *

 * @userName
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    private Integer Tid;
    private String Tname;

}
