package com.service;

import com.persistence.entity.Book;

import java.util.List;

public interface BookService {
    //   借书
   int Borrow(int studentid, int bookid ,String borrowdata, String exceptreturnTime );
    //    还书
//    这你他妈的不是返回的是int 类型吗
    int returnback(Integer bookid,int studentid);
    //添加书
    int AddBook(String bookname,String bookauthor);
    //删除书
    int DeleteBook(Integer bookid);

    /**
     * 查找所有的书
     * @return
     */
    List<Book> getAllBookList();
}
