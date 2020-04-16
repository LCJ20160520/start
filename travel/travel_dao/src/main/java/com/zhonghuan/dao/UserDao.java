package com.zhonghuan.dao;


import com.zhonghuan.domain.Userinfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface UserDao {

//    查询所有
    @Select("select * from user")
    List<Userinfo> findAll();

//    根据姓名查询用户
    @Select("select * from user where username = #{username}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "phoneNum",column = "phoneNum"),
            @Result(property = "status",column = "status"),
            @Result(property = "roles",column = "id",javaType =java.util.List.class,many = @Many(select ="com.zhonghuan.dao.RoleDao.findRoleByUserId"))
    })
    Userinfo findUserinfoByusername(String username);

//保存用户
    @Insert("insert into user (username,password,phoneNum,status) values (#{username},#{password},#{phoneNum},#{status})")
    void SaveUser(Userinfo user);
}
