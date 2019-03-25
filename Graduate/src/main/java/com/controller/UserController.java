package com.controller;

import com.persistence.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    public String login(HttpServletRequest request,Model model){

//        从前段获取两个参数request请求 model响应
        String name = request.getParameter("name");
        String password = request.getParameter("password");
//        判断数据库是否有这个用户，根据用户名和密码
        User login = userService.login(name, password);
//将用户数据传到页面上
        model.addAttribute("user",login);
//        返回页面
        return "/index";
    }
    public String register(HttpServletRequest request,Model model){
//        我只给你写一个 从前段获取两个参数request请求 model响应
        String name = request.getParameter("name");
        User user = new User();
        user.setUsername(name);
//        你这块拿User 接收干嘛
//        我给你讲了好多次了好不好
        String password = request.getParameter("password");
        user.setPassword(password);
 //     密码
        String credit = request.getParameter("credit");
 //       页面传入的是string类型，函数需要string类型
        int Credit = Integer.parseInt(credit);
        user.setCredit(Credit);

        String phonenum = request.getParameter("phonenum");
        int  Phonenum = Integer.parseInt(phonenum);
        user.setPhonenum(Phonenum);

        String authority = request.getParameter("authority");
        int Authority = Integer.parseInt(authority);
        user.setAuthority(Authority);
        int regiest = userService.register(user);

        model.addAttribute("user",regiest);
//        返回页面
        return "/index";


    }
}
