package com.zhonghuan.service.impl;

import com.zhonghuan.dao.ApplyDao;
import com.zhonghuan.domain.Apply;
import com.zhonghuan.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("ApplyService")
public class ApplyServiceimpl implements ApplyService {
    @Autowired
    private ApplyDao dao;

    @Override
    public void saveApply(Apply apply) {
        //暂时设定时间，记得改
        apply.setDeparture_time(new Date());
        apply.setReturn_time(new Date());

        apply.setTravel_price(apply.getTraffic_price()+apply.getHotel_price()+apply.getMeal_fee()+apply.getElse_price());
        dao.saveApply(apply);

    }

    @Override
    public List<Apply> findInreview() {
        return dao.findInreview();
    }


}
