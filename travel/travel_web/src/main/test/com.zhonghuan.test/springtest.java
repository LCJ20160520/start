package com.zhonghuan.test;

import com.zhonghuan.domain.Userinfo;
import com.zhonghuan.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class springtest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:application.xml");
        UserService userService= (UserService) ac.getBean("UserService");
//        List<Userinfo> lis = userService.findAll();
//        System.out.println(lis);
        Userinfo info = userService.findUserinfoByusername("刘长江");
        System.out.println(info);
    }
}
