package com.atguigu.springcloud.entities;/*
 * @AUTHOR   LiXiang
 * @Classname Student
 *
 * @Date 2021/5/19 上午11:10
 *

 * @userName
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.Sides;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Integer Sid;
    private String Sname;
    private Integer Sage;
    private String Ssex;

}
