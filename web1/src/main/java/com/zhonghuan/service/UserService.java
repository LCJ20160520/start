package com.zhonghuan.service;

import com.zhonghuan.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User login(User user);

    List<User> findAll();
}
