package cn.itcast.dao;

import cn.itcast.domain.User;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where username=#{username} and password = #{password}" )
    User login(User user);
}
