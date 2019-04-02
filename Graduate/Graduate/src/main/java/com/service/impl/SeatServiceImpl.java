package com.service.impl;

import com.persistence.dao.OrderSeatMapper;
import com.persistence.dao.SeatMapper;
import com.persistence.entity.OrderSeat;
import com.persistence.entity.OrderSeatExample;
import com.persistence.entity.Seat;
import com.persistence.entity.SeatExample;
import com.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class SeatServiceImpl implements SeatService {
    @Autowired
    SeatMapper seatMapper;
    @Autowired
    OrderSeatMapper orderSeatMapper;



    @Override
    public List<Seat> LookSeat(Integer floor) {
        SeatExample seatExample = new SeatExample();
        seatExample.createCriteria().andFloorEqualTo(floor);
        List<Seat> seats = seatMapper.selectByExample(seatExample);
        return seats;
    }

    @Override
    public int OrderSeat(int seatid,int studentId) {

        OrderSeat orderSeat = new OrderSeat();
        orderSeat.setStudentid(studentId);
        orderSeat.setSeatid(seatid);
        orderSeat.setOrderdata(new Date());
//        todo: m没写完
        return orderSeatMapper.insert(orderSeat);
    }

    @Override
    public int CancelOrder(int seatid,int studentid) {
       Seat seat =seatMapper.selectByPrimaryKey(seatid);
       seat.setStatus(1);
       int updata = seatMapper.updateByPrimaryKey(seat);
       orderSeatMapper.deleteByPrimaryKey(studentid);

        return updata;
    }

    @Override
    public int AddSeat(int floor) {
        Seat seat = new Seat();
        seat.setFloor(floor);
//hen duo

        int insert =seatMapper.insert(seat);

        return insert;
    }

    @Override
    public int SaveSeat(int seatid) {
        Seat seat = seatMapper.selectByPrimaryKey(seatid);
        seat.setStatus(0);
        int updata=  seatMapper.updateByPrimaryKey(seat);
        return  updata;
    }

    @Override
    public int SiteConfirm() {
        return 0;
    }
}
