package com.shen.mapper;

import com.shen.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: shenDanSen
 * @date: 2021/7/9 5:38 下午
 * @desc:
 */
@Repository
public interface UserMapper {
//    查询所有用户
    List<User> selectAllUser();
}
