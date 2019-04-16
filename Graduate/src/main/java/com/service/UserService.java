package com.service;

import com.persistence.entity.User;

public interface UserService {
//    登陆
    User login(String userName, String password);
//    注册
//    这你他妈的不是返回的是int 类型吗
    int register(User user);
}
