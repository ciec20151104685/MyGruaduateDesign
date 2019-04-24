package com.controller;

import com.persistence.entity.Book;
import com.persistence.entity.BorrowBook;
import com.persistence.entity.User;
import com.service.BookService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/book/")
public class BookController {
    @Autowired
    BookService bookService;
    @Autowired
    UserService userService;

    @RequestMapping("add/book/get")
    public String addbookhtml(HttpServletRequest request, Model model) {
        return "/addBook";
    }

    @RequestMapping("borrow/book/get")
    public String borrowBook(HttpServletRequest request, Model model) {
        return "/borrow";
    }

    @RequestMapping("return/book/get")
    public String returnBook(HttpServletRequest request, Model model) {
        return "/return";
    }

    @RequestMapping("alllog/book")
    public String alllog(HttpServletRequest request, Model model) {
        List<Map<String,Object>> bookIo = bookService.bookio();
        model.addAttribute("bookIoList",bookIo);
        return "/IOLog";
    }

    @RequestMapping("all/book")
    public String allbookhtml(HttpServletRequest request, Model model) {
        List<Book> bookList = bookService.getAllBookList();
        model.addAttribute("bookList", bookList);
        return "/allBook";
    }

    @ResponseBody
    @RequestMapping("borrow/book")
    public String borrowbook(HttpServletRequest request, Model model) {
        //        从前段获取两个参数request请求 model响应
        String Bookid = request.getParameter("bookid");
        String Studentid = request.getParameter("studentid");

        int bookid = Integer.parseInt(Bookid);
        int studentid = Integer.parseInt(Studentid);

//        判断数据库是否有这个用户，根据用户名和密码
        int borrow = bookService.Borrow(studentid, bookid);

        if (borrow > 0) {
            return "ok";
        } else {
            return "err";
        }
    }

    @ResponseBody
    @RequestMapping("return/book")
    public String Returnback(HttpServletRequest request, Model model) {
        String Bookid = request.getParameter("bookid");
        String Studentid = request.getParameter("studentid");
        int bookid = Integer.parseInt(Bookid);
        int studentid = Integer.parseInt(Studentid);
        int returnback = bookService.returnback(bookid, studentid);
        model.addAttribute("book", returnback);
        return "ok";

    }

    @ResponseBody
    @RequestMapping("add/book")
    public String Addbook(HttpServletRequest request, Model model) {
        String bookname = request.getParameter("bookname");
        String bookauthor = request.getParameter("bookauthor");
        String bookDetail = request.getParameter("bookDetail");
        int addbook = bookService.AddBook(bookname, bookauthor, bookDetail);
        if (addbook > 0) {
            return "ok";
        } else {
            return "err";
        }
    }

    @ResponseBody
    @RequestMapping("delete/book")
    public String Delete(HttpServletRequest request, Model model) {
        String Bookid = request.getParameter("bookid");
        int bookid = Integer.parseInt(Bookid);
        int deletebook = bookService.DeleteBook(bookid);
        model.addAttribute("book", deletebook);
        return "/index";

    }

    @RequestMapping("all/borrowbook")
    public String alluserhtml(HttpServletRequest request, Model model) {
        List<BorrowBook> borrowbookList = bookService.getAllBorrowBookList();
        model.addAttribute("borrowbookList", borrowbookList);
        return "/borrowlist";
    }


}
