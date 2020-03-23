package cn.itcast.service;

import cn.itcast.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();

    User login(User user);
}
