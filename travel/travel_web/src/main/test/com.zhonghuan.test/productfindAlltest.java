package com.zhonghuan.test;

import com.zhonghuan.domain.Product;
import com.zhonghuan.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class productfindAlltest {
    public static void main(String[] args) throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:application.xml");
        ProductService productService = (ProductService) ac.getBean("ProductService");
        List<Product> list = productService.findAll(1,5);
        System.out.println(list);

    }
}
