package com.service;

import com.persistence.entity.Book;
import com.persistence.entity.BorrowBook;

import java.util.List;
import java.util.Map;

public interface BookService {
    //   借书
   int Borrow(int studentid, int bookid);
    //    还书
//    这你他妈的不是返回的是int 类型吗
    int returnback(Integer bookid,int studentid);
    //添加书
    int AddBook(String bookname,String bookauthor,String bookDetail);
    //删除书
    int DeleteBook(Integer bookid);

    /**
     * 查找所有的书
     * @return
     */
    List<Book> getAllBookList();
    List<BorrowBook> getAllBorrowBookList();

    List<Map<String,Object>>bookio();
}
