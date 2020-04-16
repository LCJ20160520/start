package com.zhonghuan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhonghuan.dao.ProductDao;
import com.zhonghuan.domain.Product;
import com.zhonghuan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service("ProductService")
@Transactional
public class ProductServiceimpl implements ProductService {
    @Autowired
    private ProductDao dao;
    @Override
    public List<Product> findAll(int page,int pagesize) throws Exception {
        PageHelper.startPage(page,pagesize);
        return dao.findAll();
    }

    @Override
    public void Save(Product product) {
        System.out.println(product);
        dao.Save(product);
    }
}
