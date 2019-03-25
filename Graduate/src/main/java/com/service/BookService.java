package com.service;

import com.persistence.entity.Book;

public interface BookService {
    //   借书
  int Borrow(String userName, Integer bookid );
    //    还书
//    这你他妈的不是返回的是int 类型吗
    int returnback(Integer bookid);
    int AddBook(Integer bookid,String bookname,String bookauthor);
    int Delete(Integer bookid);
}
