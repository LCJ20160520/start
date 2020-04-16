package com.zhonghuan.dao;

import com.zhonghuan.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {
    @Select("select * from product")
    List<Product> findAll() throws Exception;

//    @Insert("insert into product (productNum,productName,cityName,departureTime,productPrice,productDesc) values (#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice}，#{productDesc})")
    @Insert("insert into product (productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values (#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void Save(Product product);
}
//,productName,cityName,
//