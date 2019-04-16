package com.service.impl;

import com.persistence.dao.UserMapper;
import com.persistence.entity.User;
import com.persistence.entity.UserExample;
import com.service.UserService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //    红线把鼠标放到红线上然后按alt+enter ,光标在横线上，然后选择第一个，你要看不懂就去死
    @Autowired
//            在这里注入生命的
    UserMapper userMapper;
    @Override
    //public 返回值 方法名
    public User login(String userName, String password) {
//        你的业务也是XXExample 这里只用user举例
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(userName).andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
//        userMapper.selectByExample(userExample) select 查询insert插入以此类推  看不懂就去百度
        User user = null;
        if (users!=null && users.size()>0){
            user = users.get(0);
        }
        return user;
    }

    @Override
    public int register(User user) {
//        他实际上就是调用了一个方法，方法名叫insert，返回类型是int 类型
        int insert = userMapper.insert(user);
//        一下这个两种法一个是直接返回了，一个是先声明了一下，实际上都是一样的，懂了吗？
//        听不清
//        return insert;
        return userMapper.insert(user);

    }


}
