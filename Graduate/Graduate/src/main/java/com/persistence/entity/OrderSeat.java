package com.persistence.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderSeat implements Serializable {
    private Integer studentid;

    private Integer seatid;

    private Date orderdata;

    private Date delatedata;

    private Integer savetime;

    private Integer outorder;

    private static final long serialVersionUID = 1L;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }

    public Date getOrderdata() {
        return orderdata;
    }

    public void setOrderdata(Date orderdata) {
        this.orderdata = orderdata;
    }

    public Date getDelatedata() {
        return delatedata;
    }

    public void setDelatedata(Date delatedata) {
        this.delatedata = delatedata;
    }

    public Integer getSavetime() {
        return savetime;
    }

    public void setSavetime(Integer savetime) {
        this.savetime = savetime;
    }

    public Integer getOutorder() {
        return outorder;
    }

    public void setOutorder(Integer outorder) {
        this.outorder = outorder;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderSeat other = (OrderSeat) that;
        return (this.getStudentid() == null ? other.getStudentid() == null : this.getStudentid().equals(other.getStudentid()))
            && (this.getSeatid() == null ? other.getSeatid() == null : this.getSeatid().equals(other.getSeatid()))
            && (this.getOrderdata() == null ? other.getOrderdata() == null : this.getOrderdata().equals(other.getOrderdata()))
            && (this.getDelatedata() == null ? other.getDelatedata() == null : this.getDelatedata().equals(other.getDelatedata()))
            && (this.getSavetime() == null ? other.getSavetime() == null : this.getSavetime().equals(other.getSavetime()))
            && (this.getOutorder() == null ? other.getOutorder() == null : this.getOutorder().equals(other.getOutorder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStudentid() == null) ? 0 : getStudentid().hashCode());
        result = prime * result + ((getSeatid() == null) ? 0 : getSeatid().hashCode());
        result = prime * result + ((getOrderdata() == null) ? 0 : getOrderdata().hashCode());
        result = prime * result + ((getDelatedata() == null) ? 0 : getDelatedata().hashCode());
        result = prime * result + ((getSavetime() == null) ? 0 : getSavetime().hashCode());
        result = prime * result + ((getOutorder() == null) ? 0 : getOutorder().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentid=").append(studentid);
        sb.append(", seatid=").append(seatid);
        sb.append(", orderdata=").append(orderdata);
        sb.append(", delatedata=").append(delatedata);
        sb.append(", savetime=").append(savetime);
        sb.append(", outorder=").append(outorder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}