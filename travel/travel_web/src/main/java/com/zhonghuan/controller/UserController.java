package com.zhonghuan.controller;

import com.zhonghuan.domain.Userinfo;
import com.zhonghuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Userinfo> list = service.findAll();
        ModelAndView mv=new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("list");

        return mv;

    }

//    @RequestMapping("login")
//    public String login(Userinfo user){
//        Boolean flag = service.login(user);
//        if (flag){
//            return "list";
//        }
//        return "fail";
//    }

    @RequestMapping(value="/dispatch", method = RequestMethod.GET)
    public String  dispatch(HttpServletRequest request) {
//        String path = request.getContextPath() ;
//        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//
//        Set<String> roles = AuthorityUtils.authorityListToSet(SecurityContextHolder.getContext()
//                .getAuthentication().getAuthorities());
        UserDetails user = service.loadUserByUsername(request.getParameter("username"));
//        System.out.println(user);
        if (user.toString().contains("ROLE_ADMIN")) {
            System.out.println("管理员");
            return "admin-main";
//            return new RedirectView(basePath + "admin-main");
        }
        if (user.toString().contains("ROLE_USER")) {
            System.out.println("职工");
            return "user-main";
//            return new RedirectView(basePath + "user-main");
        }
        if (user.toString().contains("ROLE_ACCOUNTANT")) {
            System.out.println("财务");
            return "accountant-main";
//            return new RedirectView(basePath + "user-main");
        }
        return "fail";
//        return new RedirectView(basePath+"fail");

    }

    @RequestMapping("SaveUser")
    public void SaveUser(Userinfo user){
//        service.SaveUser(user);
    }


}
