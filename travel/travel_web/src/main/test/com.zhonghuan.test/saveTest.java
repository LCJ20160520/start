package com.zhonghuan.test;

import com.zhonghuan.domain.Product;
import com.zhonghuan.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class saveTest {

    ApplicationContext ac=null;
    @Before
    public void init(){
        ac=new ClassPathXmlApplicationContext("classpath:application.xml");

    }

    @Test
    public void save(){
        ProductService productService = (ProductService) ac.getBean("ProductService");
        Product product=new Product();
        product.setProductNum("se232");
        product.setProductName("天堂一日游");
        product.setCityName("天津");
        product.setDepartureTime(new Date());
        product.setProductPrice(12.4f);
        product.setProductDesc("还行");
        product.setProductStatus(1);

        productService.Save(product);

    }
}
