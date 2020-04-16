package cn.itcast.controller;

import cn.itcast.domain.User;

import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("User")
public class UserController {

//   @Autowired
//   private UserService service;

    @RequestMapping("/login")
    public String login(User user){
//        UserService service=new UserServiceimpl();
//        System.out.println(user);
//        User login = service.login(user);
//        System.out.println("login user"+login);
        return "list";
    }

    @RequestMapping("/regist")
    public String Regist(User user){
        System.out.println(user);
        return "list";
    }

    @RequestMapping("demo")
    public String demo(){
        return "list";
    }

}
