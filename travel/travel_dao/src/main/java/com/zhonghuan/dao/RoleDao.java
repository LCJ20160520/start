package com.zhonghuan.dao;

import com.zhonghuan.domain.Role;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao {

    @Select("select * from role where id in (select user_role.roleid from user_role where user_role.userid = #{userid})")
    Role findRoleByUserId(int userid);
}
