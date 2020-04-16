package com.zhonghuan.controller;

import com.zhonghuan.domain.Apply;
import com.zhonghuan.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("Apply")
public class ApplyController {

    @Autowired
    private ApplyService applyService;


    @RequestMapping("saveApply")
    public String saveApply(Apply apply){
//        System.out.println("被访问");
        System.out.println(apply);
        applyService.saveApply(apply);
        return "user-main";
    }

    @RequestMapping("findAudit")
    public ModelAndView findAduit(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        List<Apply> inreview = applyService.findInreview();
        System.out.println(inreview);
        ModelAndView mv=new ModelAndView();
        mv.addObject("inreview",inreview);
        mv.setViewName("a-unreviewed-list");
        return mv;
    }
}
