package com.persistence.dao;

import com.persistence.entity.BorrowBook;
import com.persistence.entity.BorrowBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowBookMapper {
    int deleteByExample(BorrowBookExample example);

    int deleteByPrimaryKey(Integer studentid);

    int insert(BorrowBook record);

    int insertSelective(BorrowBook record);

    List<BorrowBook> selectByExample(BorrowBookExample example);

    BorrowBook selectByPrimaryKey(Integer studentid);

    int updateByExampleSelective(@Param("record") BorrowBook record, @Param("example") BorrowBookExample example);

    int updateByExample(@Param("record") BorrowBook record, @Param("example") BorrowBookExample example);

    int updateByPrimaryKeySelective(BorrowBook record);

    int updateByPrimaryKey(BorrowBook record);
}