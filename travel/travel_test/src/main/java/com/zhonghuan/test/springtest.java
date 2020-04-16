package com.zhonghuan.test;

import com.zhonghuan.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

public class springtest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("application.xml");
        UserService userService= (UserService) ac.getBean("UserService");
        userService.findAll();

    }
}
