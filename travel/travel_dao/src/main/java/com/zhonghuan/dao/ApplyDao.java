package com.zhonghuan.dao;

import com.zhonghuan.domain.Apply;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ApplyDao {
//新建申请
    @Insert("insert into apply(address,destination,departure_time,return_time,traffic_price,hotel_price,meal_fee,else_price,else_price_desc,travel_price,approval_status,completion_status,task) values (#{address},#{destination},#{departure_time},#{return_time},#{traffic_price},#{hotel_price},#{meal_fee},#{else_price},#{else_price_desc},#{travel_price},#{approval_status},#{completion_status},#{task})")
    void saveApply(Apply apply);

//查询所有未通过申请
    @Select("select * from apply where approval_status = 0")
    List<Apply> findInreview();

}
