package com.persistence.dao;

import com.persistence.entity.User;
import com.persistence.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
//    这分别对应了 删除 ，更新 ，插入，查询
//    含有Example的是根据条件做以上操作
//    不含是直接根据id做操作
//    懂了吗？
//    我们以 deleteByPrimaryKey 为例 ，仔细看好了！
    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}