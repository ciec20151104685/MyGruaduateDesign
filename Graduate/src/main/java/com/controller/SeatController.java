package com.controller;

import com.persistence.entity.Seat;
import com.service.SeatService;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class SeatController {
    SeatService seatService;
    public String LookSeat(HttpServletRequest request, Model model){
        //        从前段获取两个参数request请求 model响应
        String Floor = request.getParameter("floor");
        int floor = Integer.parseInt(Floor);
        List<Seat> lookseat = seatService.LookSeat(floor);
//将用户数据传到页面上r
        model.addAttribute("seat",lookseat);
//        返回页面

        return "/index";
    }

    public String OrderSeat(HttpServletRequest request,Model model){
        String Seatid = request.getParameter("seatid");
        int seatid = Integer.parseInt(Seatid);
        String Studentid = request.getParameter("studentid");
        int studentid = Integer.parseInt(Studentid);
        int orderseat = seatService.OrderSeat(seatid,studentid);
        model.addAttribute("seat",orderseat);
        return "/index";

    }

    public String CancelSeat (HttpServletRequest request, Model model){
        String Seatid = request.getParameter("seatid");
        int seatid = Integer.parseInt(Seatid);
        String Studentid = request.getParameter("studentid");
        int studentid = Integer.parseInt(Studentid);
        int cancelseat = seatService.CancelOrder(seatid,studentid);
        model.addAttribute("seat",cancelseat);
        return "/index";
    }

    public String Addseat (HttpServletRequest request, Model model){
        String Floor = request.getParameter("floor");
        int floor = Integer.parseInt(Floor);
        int addseat = seatService.AddSeat(floor);
        model.addAttribute("seat",addseat);
        return "/index";

    }

    public String Saveseat (HttpServletRequest request, Model model){
        String Seatid = request.getParameter("seatid");
        int seatid = Integer.parseInt(Seatid);
        int saveseat = seatService.SaveSeat(seatid);
        model.addAttribute("seat",saveseat);
        return "/index";

    }

    public String  SiteConfirm(HttpServletRequest request,Model model){
        return "/index";
    }


}
