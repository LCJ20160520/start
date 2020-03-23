package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("User")
@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/login")
    public String login(User user){
        service.login(user);
        return "list";
    }

    @RequestMapping("/regist")
    public String Regist(User user){
        System.out.println(user);
        return "list";
    }

}
