package com.shen.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @author: shenDanSen
 * @date: 2021/7/9 2:16 下午
 * @desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userId;
    private String account;
    private String password;
    private String sex;
    private int age;

}
