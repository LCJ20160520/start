package com.zhonghuan.service.impl;

import com.zhonghuan.dao.UserDao;
import com.zhonghuan.domain.Role;
import com.zhonghuan.domain.Userinfo;
import com.zhonghuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service("UserService")
@Transactional
public class UserServiceimpl  implements UserService  {

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserDao userdao;

//根据姓名查询userinfo
    @Override
    public Userinfo findUserinfoByusername(String username) {
        System.out.println("username"+username);
        return userdao.findUserinfoByusername(username);
    }

//    查询所有
    @Override
    public List<Userinfo> findAll() {
        System.out.println("findAll");
        List<Userinfo> list = userdao.findAll();
        System.out.println(list);
        return list;


    }




////    保存用户
//    @Override
//    public void SaveUser(Userinfo user) {
//        //加密密码
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
////        赋值默认状态为1
//        user.setStatus(1);
//        userdao.SaveUser(user);
//    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Userinfo info = userdao.findUserinfoByusername(username);
        System.out.println("info:"+info);
        User user=new User(info.getUsername(),"{noop}"+info.getPassword(),getAuthority(info.getRoles()));

        return user;
    }



    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {

        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        return list;
    }
}
