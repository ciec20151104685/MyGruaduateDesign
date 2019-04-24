package com.service.impl;

import com.persistence.dao.A_BookMapper;
import com.persistence.dao.BookMapper;
import com.persistence.dao.BorrowBookMapper;
import com.persistence.entity.*;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BorrowBookMapper borrowBookMapper;
    @Autowired
    BookMapper bookMapper;
    @Autowired
    A_BookMapper a_bookMapper;

    public int Borrow(int studentid, int bookId ) {
        Book book = new Book();
        BookExample bookExample = new BookExample();
        bookExample.createCriteria().andBookidEqualTo(bookId);
        List<Book> books =  bookMapper.selectByExample(bookExample);
        book = books.get(0);
        book.setBookstatus(0);
        BorrowBook borrowBook = new BorrowBook();
        borrowBook.setStudentid(studentid);
        borrowBook.setBookid(book.getBookid());
        borrowBook.setBorrowdata(new Date());
        borrowBook.setExceptreturntime(new Date(10));
        int updata = borrowBookMapper.insert(borrowBook);


        return updata;

    }

    @Override
    public int returnback(Integer bookid,int studentid) {
        Book book= bookMapper.selectByPrimaryKey(bookid);
        book.setBookstatus(1);
        BorrowBookExample borrowBookExample = new BorrowBookExample();
        borrowBookExample.createCriteria().andBookidEqualTo(bookid).andStudentidEqualTo(studentid);
        List<BorrowBook> borrowBooks = borrowBookMapper.selectByExample(borrowBookExample);
        BorrowBook borrowBook = borrowBooks.get(0);
        borrowBook.setReturndata(new Date());
        int i = borrowBookMapper.updateByExampleSelective(borrowBook, borrowBookExample);
        return i;
    }

    @Override
    public int AddBook(String bookname, String bookauthor,String bookDetail) {
        Book book = new Book();
        book.setBookname(bookname);
        book.setBookname(bookauthor);
        book.setBookdetil(bookDetail);
        int insert =bookMapper.insert(book);

        return insert;
    }

    @Override
    public int DeleteBook(Integer bookid) {
       int delete = bookMapper.deleteByPrimaryKey(bookid);
       return  delete;
    }

    @Override
    public List<Book> getAllBookList() {
        return bookMapper.selectByExample(new BookExample());
    }

    @Override
    public List<BorrowBook> getAllBorrowBookList() {
        return borrowBookMapper.selectByExample(new BorrowBookExample());
    }

    @Override
    public List<Map<String, Object>> bookio() {
        return a_bookMapper.bookio();
    }
}
