package com.zhonghuan.service;

import com.zhonghuan.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll(int page,int pagesize) throws Exception;

    void Save(Product product);
}
