package com.zhonghuan.controller;

import com.github.pagehelper.PageInfo;
import com.zhonghuan.domain.Product;
import com.zhonghuan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("Product")
public class ProductController  {

    @Autowired
    private ProductService service;

    @RequestMapping("findAll")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1") int page,@RequestParam(name = "pagesize",required = true,defaultValue = "5") int pagesize) throws Exception {
        ModelAndView mv=new ModelAndView();
        List<Product> list = service.findAll(page,pagesize);
        PageInfo info=new PageInfo(list);
        mv.addObject("pageinfo",info);
        mv.setViewName("/page/product-page-list.jsp");

        return mv;
    }



    @RequestMapping("Save")
    public String Save(Product product){
        service.Save(product);
        return "redirect:findAll";
    }

}
