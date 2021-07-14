package com.shen.service;

import com.shen.bean.User;

import java.util.List;

/**
 * @version 1.0
 * @author: shenDanSen
 * @date: 2021/7/9 5:38 下午
 * @desc:
 */
public interface UserService {
    //    查询所有用户
    List<User> selectAllUser();
}
