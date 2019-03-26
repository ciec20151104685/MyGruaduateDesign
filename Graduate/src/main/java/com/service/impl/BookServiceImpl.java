package com.service.impl;

import com.persistence.dao.BookMapper;
import com.persistence.dao.BorrowBookMapper;
import com.persistence.entity.*;
import com.service.BookService;
import org.apache.poi.hssf.record.BookBoolRecord;

import java.util.List;

public class BookServiceImpl implements BookService {
    BorrowBookMapper borrowBookMapper;
    BookMapper bookMapper;
    @Override
    public int Borrow(String userName, Integer bookid) {
        //   你的业务也是XXExample 这里只用user举例
        BorrowBookExample borrowBookExample = new BorrowBookExample();
        BookExample bookExample = new BookExample();
       // borrowBookExample.createCriteria().andBookidEqualTo(bookid)=select * from borrow_book where bookid = "bookid"
        bookExample.createCriteria().andBookidEqualTo(bookid);
        List<Book> books = bookMapper.selectByExample(bookExample);
        books.get(0).getBookauthor();
//        userMapper.selectByExample(userExample) select 查询insert插入以此类推  看不懂就去百度
        Book book=null;
        if (book!=null){
           book = books.get(0);
           book.setBookstatus(0);
          // borrowBookExample.createCriteria()
           BorrowBook borrowBook = new BorrowBook();
           borrowBook.setBookid(bookid);
           borrowBook.setStudentid(1000);
        }
        return 0;

    }

    @Override
    public int returnback(Integer bookid) {
        //   你的业务也是XXExample 这里只用user举例
        BorrowBookExample borrowBookExample = new BorrowBookExample();
        BookExample bookExample = new BookExample();
        // borrowBookExample.createCriteria().andBookidEqualTo(bookid)=select * from borrow_book where bookid = "bookid"
        bookExample.createCriteria().andBookidEqualTo(bookid);
        borrowBookExample.createCriteria().andBookidEqualTo(bookid);
        List<Book> books = bookMapper.selectByExample(bookExample);
        borrowBookMapper.deleteByExample(borrowBookExample);
        books.get(0).setBookstatus(1);
//        userMapper.selectByExample(userExample) select 查询insert插入以此类推  看不懂就去百度

        return 0;



    }

    @Override
    public int AddBook(Integer bookid, String bookname, String bookauthor) {
        BookExample bookExample = new BookExample();
        //bookExample.createCriteria().and
        int insert = bookMapper.insert(bookauthor,bookid,bookname);
//        userMapper.selectByExample(userExample) select 查询insert插入以此类推  看不懂就去百
        return bookMapper.insert(bookauthor,bookid,bookname);
    }

    @Override
    public int DeleteBook(Integer bookid) {
        //   你的业务也是XXExample 这里只用user举
        BookExample bookExample = new BookExample();
        // borrowBookExample.createCriteria().andBookidEqualTo(bookid)=select * from borrow_book where bookid = "bookid"
        bookExample.createCriteria().andBookidEqualTo(bookid);
        bookMapper.deleteByPrimaryKey(bookid);
//        userMapper.selectByExample(userExample) select 查询insert插入以此类推  看不懂就去百度
        return 0;
    }
}
