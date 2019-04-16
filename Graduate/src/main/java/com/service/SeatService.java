package com.service;

import com.persistence.entity.Seat;

import java.util.List;

public interface SeatService {
    List<Seat> LookSeat(Integer floor);
    //浏览位置
    int OrderSeat(int seatid,int studentId);
    //预约位置
    int CancelOrder(int seatid,int studentid);
    //取消预约
    int AddSeat(int floor);
    //管理员添加位置
    int SaveSeat(int seatid);
    //管理员保留位置
    int SiteConfirm();
    //位置确认

}