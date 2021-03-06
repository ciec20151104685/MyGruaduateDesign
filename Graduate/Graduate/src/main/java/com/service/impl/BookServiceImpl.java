package com.service.impl;

import com.persistence.dao.BookMapper;
import com.persistence.dao.BorrowBookMapper;
import com.persistence.entity.*;
import com.service.BookService;
import org.apache.poi.hssf.record.BookBoolRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BorrowBookMapper borrowBookMapper;
    @Autowired
    BookMapper bookMapper;

    public int Borrow(int studentid, String bookid) {
        Book book = new Book();
        BookExample bookExample = new BookExample();
        bookExample.createCriteria().andBooknameEqualTo(bookid);
        List<Book> books =  bookMapper.selectByExample(bookExample);
        book = books.get(0);
        book.setBookstatus(0);
        BorrowBook borrowBook = new BorrowBook();
        borrowBook.setStudentid(studentid);
        borrowBook.setBookid(book.getBookid());
        int updata = borrowBookMapper.updateByPrimaryKey(borrowBook);


        return updata;

    }


    @Override
    public int Borrow(int studentid, int bookid) {
            return 0;
    }

    public int returnback(Integer bookid, int studentid) {
        Book book;
        book = bookMapper.selectByPrimaryKey(bookid);
        book.setBookstatus(1);
        int delete = borrowBookMapper.deleteByPrimaryKey(studentid);

        return delete;




    }

    @Override
    public int AddBook(String bookname, String bookauthor) {
        Book book = new Book();
        book.setBookname(bookname);
        book.setBookname(bookauthor);
        int insert =bookMapper.insert(book);

        return insert;
    }

    @Override
    public int DeleteBook(Integer bookid) {
       int delete = bookMapper.deleteByPrimaryKey(bookid);
       return  delete;
    }
}
