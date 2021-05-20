package com.atguigu.springcloud.entities;/*
 * @AUTHOR   LiXiang
 * @Classname Score
 *
 * @Date 2021/5/19 上午11:12
 *

 * @userName
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    private Integer Sid;
    private Integer Cid;
    private Integer score;
}
