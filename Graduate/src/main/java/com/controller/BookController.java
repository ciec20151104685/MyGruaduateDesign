package com.controller;

import com.persistence.entity.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/book/")
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("add/book/get")
    public String addbookhtml(HttpServletRequest request, Model model) {
        return "/addBook";
    }
    @RequestMapping("all/book")
    public String allbookhtml(HttpServletRequest request, Model model) {
        List<Book> bookList = bookService.getAllBookList();
        model.addAttribute("bookList",bookList);
        return "/allBook";
    }
    @ResponseBody
    @RequestMapping("borrow/book")
    public String borrowbook(HttpServletRequest request, Model model) {
        //        从前段获取两个参数request请求 model响应
        String Bookid = request.getParameter("bookid");
        String Studentid = request.getParameter("studentid");
        String Borrowdata = request.getParameter("borrowdata");
        String ExceptreturnTime = request.getParameter("exceptreturnTime");
        int bookid = Integer.parseInt(Bookid);
        int studentid = Integer.parseInt(Studentid);
        String borrowdata = Borrowdata;
        String exceptreturnTime = ExceptreturnTime;
//        判断数据库是否有这个用户，根据用户名和密码
        int borrow = bookService.Borrow(studentid, bookid,borrowdata,exceptreturnTime);
//将用户数据传到页面上
        model.addAttribute("book", borrow);
//        返回页面
        return "ok";
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
        int addbook = bookService.AddBook(bookname, bookauthor);
        model.addAttribute("book", addbook);
        return "/index";

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

}
