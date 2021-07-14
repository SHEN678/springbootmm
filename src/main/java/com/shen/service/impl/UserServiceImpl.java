package com.shen.service.impl;

import com.shen.bean.User;
import com.shen.mapper.UserMapper;
import com.shen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: shenDanSen
 * @date: 2021/7/9 5:39 下午
 * @desc:
 */
@Service
public class UserServiceImpl implements UserService {
    //service调用mapper层
    @Autowired
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Override
    public List<User> selectAllUser() {

        return userMapper.selectAllUser();
    }
}
