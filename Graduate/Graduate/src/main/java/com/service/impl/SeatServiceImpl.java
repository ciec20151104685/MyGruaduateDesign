package com.service.impl;

import com.persistence.dao.OrderSeatMapper;
import com.persistence.dao.SeatMapper;
import com.persistence.entity.OrderSeat;
import com.persistence.entity.OrderSeatExample;
import com.persistence.entity.Seat;
import com.persistence.entity.SeatExample;
import com.service.SeatService;

import java.util.List;

public class SeatServiceImpl implements SeatService {
    SeatMapper seatMapper;
    OrderSeatMapper orderSeatMapper;
    @Override
    public int LookSeat() {
        //   你的业务也是XXExample 这里只用user举例
        SeatExample seatExample = new SeatExample();
        // borrowBookExample.createCriteria().andBookidEqualTo(bookid)=select * from borrow_book where bookid = "bookid"
        seatExample.createCriteria().andFloorEqualTo(floor);
        List<Seat> seats = SeatMapper.selectByExample(seatExample);

//        userMapper.selectByExample(userExample) select 查询insert插入以此类推  看不懂就去百度
//hhhhhhh
        return 0;
    }

    @Override
    public int OrderSeat() {
        //   你的业务也是XXExample 这里只用user举例
        OrderSeatExample orderSeatExample = new OrderSeatExample();
        SeatExample seatExample = new SeatExample();
        // borrowBookExample.createCriteria().andBookidEqualTo(bookid)=select * from borrow_book where bookid = "bookid"
        seatExample.createCriteria().andSeatidEqualTo(Seatid);
        List<Seat> seats = SeatMapper.selectByExample(seatExample);
//        seats.get(0).getBookauthor();
//        userMapper.selectByExample(userExample) select 查询insert插入以此类推  看不懂就去百度
        Seat seat=null;
        if (seat!=null){
            seat = seats.get(0);
            seat.setSeatstatus(0);
            // borrowBookExample.createCriteria()
            OrderSeat orderSeat = new OrderSeat();
            orderSeat.setStudentid(1);
        }
        return 0;
    }

    @Override
    public int CancelOrder() {
        OrderSeatExample orderSeatExample = new OrderSeatExample();
        SeatExample seatExample = new SeatExample();
        seatExample.createCriteria().andSeatidEqualTo(Seatid);
        orderSeatExample.createCriteria().andSeatidEqualTo(Seatid);
        List<OrderSeat> orderSeats=orderSeatMapper.deleteByPrimaryKey(1);
        List<Seat> seats = SeatMapper.selectByExample(seatExample);
        Seat seat= seats.get(0);
        seat.setSeatid(1);


        return 0;
    }

    @Override
    public int AddSeat() {
        SeatExample seatExample = new SeatExample();

        //bookExample.createCriteria().and
        int insert =seatMapper.insert(seat);
//        userMapper.selectByExample(userExample) select 查询insert插入以此类推  看不懂就去百
        return insert;
    }

    @Override
    public int SaveSeat() {
        SeatExample seatExample = new SeatExample();
        seatExample.createCriteria().andSeatidEqualTo(Seatid);
        List<Seat> seats = SeatMapper.selectByExample(seatExample);
        Seat seat= seats.get(0);
        seat.setSeatid(1);


        return 0;
    }

    @Override
    public int SiteConfirm() {
        return 0;
    }
}
