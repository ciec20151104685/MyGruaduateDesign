package com.controller;

import com.persistence.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    UserService userService;
//instead of string

    @RequestMapping("login/get")
    public String loginhtml(HttpServletRequest request, Model model) {
        return "/login";
    }

    @ResponseBody
    @RequestMapping("login")
    public String login(HttpServletRequest request, Model model) {
//        从前段获取两个参数request请求 model响应
        String name = request.getParameter("username");
        String password = request.getParameter("password");
//        判断数据库是否有这个用户，根据用户名和密码
        User login = userService.login(name, password);
        if (login != null) {
            return "ok";
        } else {
            return "err";
        }
    }


    @RequestMapping("index")
    public String index(HttpServletRequest request, Model model) {

        return "/index";

    }
    @RequestMapping("register1")
    public String register1(HttpServletRequest request, Model model) {

        return "/register";

    }

    @ResponseBody
    @RequestMapping("register")
    public String register(HttpServletRequest request, Model model) {
//        我只给你写一个 从前段获取两个参数request请求 model响应
        String name = request.getParameter("username");
        User user = new User();
        user.setUsername(name);
//        你这块拿User 接收干嘛
//        我给你讲了好多次了好不好
        String password = request.getParameter("password");
        user.setPassword(password);

        user.setCredit(100);

        String phonenum = request.getParameter("phonenum");
        int Phonenum = Integer.parseInt(phonenum);
        user.setPhonenum(Phonenum);
        user.setAuthority(0);
        String mail = request.getParameter("mail");
        user.setMail(mail);
        String stuname = request.getParameter("stuname");
        user.setStuname(stuname);
        int regiest = userService.register(user);
        model.addAttribute("user", regiest);
//        返回页面
        return "ok";


    }
}
