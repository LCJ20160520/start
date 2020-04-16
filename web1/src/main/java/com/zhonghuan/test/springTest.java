package com.zhonghuan.test;

import com.zhonghuan.domain.User;
import com.zhonghuan.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class springTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userSerice = (UserService) ac.getBean("UserService");
        List<User> lis = userSerice.findAll();
        System.out.println(lis);
    }


}
