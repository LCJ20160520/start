package com.zhonghuan.test;

import com.zhonghuan.domain.Userinfo;
import com.zhonghuan.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class logintest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:application.xml");
        UserService userService = (UserService) ac.getBean("UserService");
        Userinfo userinfo=new Userinfo();
//        user.setUsername("刘长江");
//        user.setPassword("123123");
//        Boolean flag = userService.login(user);
//        System.out.println(flag);

//        user.setUsername("王五");
//        user.setPassword("123123");
//        user.setPhoneNum("12312312311");
//        userService.SaveUser(user);
//        userService.findAll();
        UserDetails user = userService.loadUserByUsername("李四");
        if (user.toString().contains("USER")){
            System.out.println("123");
        }
    }
}
