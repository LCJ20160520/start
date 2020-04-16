package com.zhonghuan.test;

import com.zhonghuan.domain.Apply;
import com.zhonghuan.domain.Product;
import com.zhonghuan.service.ApplyService;
import com.zhonghuan.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class applysaveTest {

    ApplicationContext ac=null;
    @Before
    public void init(){
        ac=new ClassPathXmlApplicationContext("classpath:application.xml");

    }

    @Test
    public void save(){
        Apply apply=new Apply();
        apply.setAddress("天津");
        apply.setDestination("北京");
        apply.setTraffic_price(1230000.0);
        apply.setHotel_price(123.0);
        apply.setMeal_fee(123.0);
        apply.setTravel_price(123.0);
        apply.setElse_price(123.0);
        apply.setElse_price_desc("123");
        apply.setTask("wode");

        apply.setApproval_status(1);
        apply.setCompletion_status(1);


        ApplyService applyService = ac.getBean("ApplyService", ApplyService.class);
        applyService.saveApply(apply);



    }

    @Test
    public void demo01(){
        ApplyService applyService = ac.getBean("ApplyService", ApplyService.class);
        List<Apply> inreview = applyService.findInreview();
        for (Apply apply:inreview
             ) {
            System.out.println(apply+apply.getApproval_statusStr());


        }
    }
}
