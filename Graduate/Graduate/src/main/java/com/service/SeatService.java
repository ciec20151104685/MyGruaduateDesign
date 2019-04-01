package com.service;

public interface SeatService {
    int LookSeat();
    //浏览位置
    int OrderSeat();
    //预约位置
    int CancelOrder();
    //取消预约
    int AddSeat();
    //管理员添加位置
    int SaveSeat();
    //管理员保留位置
    int SiteConfirm();
    //位置确认

}