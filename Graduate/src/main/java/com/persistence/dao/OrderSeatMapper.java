package com.persistence.dao;

import com.persistence.entity.OrderSeat;
import com.persistence.entity.OrderSeatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSeatMapper {
    int deleteByExample(OrderSeatExample example);

    int deleteByPrimaryKey(Integer studentid);

    int insert(OrderSeat record);

    int insertSelective(OrderSeat record);

    List<OrderSeat> selectByExample(OrderSeatExample example);

    OrderSeat selectByPrimaryKey(Integer studentid);

    int updateByExampleSelective(@Param("record") OrderSeat record, @Param("example") OrderSeatExample example);

    int updateByExample(@Param("record") OrderSeat record, @Param("example") OrderSeatExample example);

    int updateByPrimaryKeySelective(OrderSeat record);

    int updateByPrimaryKey(OrderSeat record);
}