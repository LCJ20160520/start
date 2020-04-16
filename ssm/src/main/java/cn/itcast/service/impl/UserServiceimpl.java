package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceimpl implements UserService {

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
