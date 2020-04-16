package com.zhonghuan.service.impl;

import com.zhonghuan.dao.UserDao;
import com.zhonghuan.domain.User;
import com.zhonghuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceimpl implements UserService{

    @Autowired
    private UserDao dao;



    public List<User> findAll() {
        List<User> list = dao.findAll();
        System.out.println(list);
        return list;
    }

    @Override
    public User login(User user) {
        System.out.println("service user"+user);
        return dao.login(user);
    }
}
