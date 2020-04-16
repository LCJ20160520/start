package com.zhonghuan.controller;

import com.zhonghuan.domain.User;
import com.zhonghuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/login")
    public String login(User user){
//        User login = service.login(user);
//        System.out.println(login);
        return "list";
    }
}
