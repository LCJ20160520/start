package com.zhonghuan.service;

import com.zhonghuan.domain.Userinfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    Userinfo findUserinfoByusername(String username);

    List<Userinfo> findAll();

//    @Override
//    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;

//    void SaveUser(Userinfo user);
}
