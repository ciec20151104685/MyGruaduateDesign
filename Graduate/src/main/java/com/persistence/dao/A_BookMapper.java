package com.persistence.dao;

import com.persistence.entity.Book;
import com.persistence.entity.BookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface A_BookMapper {
    List<Map<String,Object>> bookio();
}