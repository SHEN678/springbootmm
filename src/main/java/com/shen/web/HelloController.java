package com.shen.web;

import com.shen.bean.User;
import com.shen.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @version 1.0
 * @author: shenDanSen
 * @date: 2021/7/12 3:56 下午
 * @desc:
 */
@Controller
@RequestMapping("/admin")
public class HelloController {
    @Autowired
    private UserServiceImpl userService;

//    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @ResponseBody
    @PostMapping ("/getHello4")
    public String getHello4(String userName,String password){
        System.out.println(userName);
        System.out.println(password);
        List<User> users = userService.selectAllUser();
        System.out.println(users);
        return "1111";
    }
}
