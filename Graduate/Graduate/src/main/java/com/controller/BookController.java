package com.controller;

import com.persistence.entity.Book;
import com.service.BookService;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

public class BookController {
    BookService bookService;

    public String borrowbook(HttpServletRequest request, Model model){
        //        从前段获取两个参数request请求 model响应
        String Bookid = request.getParameter("bookid");
        String Studentid = request.getParameter("studentid");
        int bookid = Integer.parseInt(Bookid);
        int studentid = Integer.parseInt(Studentid);
//        判断数据库是否有这个用户，根据用户名和密码
        int borrow = bookService.Borrow(studentid,bookid );
//将用户数据传到页面上
        model.addAttribute("book",borrow);
//        返回页面
        return "/index";
    }

    public String Returnback(HttpServletRequest request, Model model){
        String Bookid = request.getParameter("bookid");
        String Studentid = request.getParameter("studentid");
        int bookid = Integer.parseInt(Bookid);
        int studentid = Integer.parseInt(Studentid);
        int returnback = bookService.returnback(bookid,studentid);
        model.addAttribute("book",returnback);
        return "/index";

    }

    public  String Addbook(HttpServletRequest request, Model model){
        String bookname = request.getParameter("bookname");
        String bookauthor = request.getParameter("bookauthor");
        int addbook = bookService.AddBook(bookname,bookauthor);
        model.addAttribute("book",addbook);
        return "/index";

    }

    public  String Delete(HttpServletRequest request, Model model){
        String Bookid = request.getParameter("bookid");
        int bookid = Integer.parseInt(Bookid);
        int deletebook = bookService.DeleteBook(bookid);
        model.addAttribute("book",deletebook);
        return "/index";

    }

}
