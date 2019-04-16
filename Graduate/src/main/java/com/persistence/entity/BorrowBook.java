package com.persistence.entity;

import java.io.Serializable;
import java.util.Date;

public class BorrowBook implements Serializable {
    private Integer studentid;

    private Integer bookid;

    private Date borrowdata;

    private Date returndata;

    private Date exceptreturntime;

    private Integer overdata;

    private static final long serialVersionUID = 1L;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Date getBorrowdata() {
        return borrowdata;
    }

    public void setBorrowdata(Date borrowdata) {
        this.borrowdata = borrowdata;
    }

    public Date getReturndata() {
        return returndata;
    }

    public void setReturndata(Date returndata) {
        this.returndata = returndata;
    }

    public Date getExceptreturntime() {
        return exceptreturntime;
    }

    public void setExceptreturntime(Date exceptreturntime) {
        this.exceptreturntime = exceptreturntime;
    }

    public Integer getOverdata() {
        return overdata;
    }

    public void setOverdata(Integer overdata) {
        this.overdata = overdata;
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
        BorrowBook other = (BorrowBook) that;
        return (this.getStudentid() == null ? other.getStudentid() == null : this.getStudentid().equals(other.getStudentid()))
            && (this.getBookid() == null ? other.getBookid() == null : this.getBookid().equals(other.getBookid()))
            && (this.getBorrowdata() == null ? other.getBorrowdata() == null : this.getBorrowdata().equals(other.getBorrowdata()))
            && (this.getReturndata() == null ? other.getReturndata() == null : this.getReturndata().equals(other.getReturndata()))
            && (this.getExceptreturntime() == null ? other.getExceptreturntime() == null : this.getExceptreturntime().equals(other.getExceptreturntime()))
            && (this.getOverdata() == null ? other.getOverdata() == null : this.getOverdata().equals(other.getOverdata()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStudentid() == null) ? 0 : getStudentid().hashCode());
        result = prime * result + ((getBookid() == null) ? 0 : getBookid().hashCode());
        result = prime * result + ((getBorrowdata() == null) ? 0 : getBorrowdata().hashCode());
        result = prime * result + ((getReturndata() == null) ? 0 : getReturndata().hashCode());
        result = prime * result + ((getExceptreturntime() == null) ? 0 : getExceptreturntime().hashCode());
        result = prime * result + ((getOverdata() == null) ? 0 : getOverdata().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentid=").append(studentid);
        sb.append(", bookid=").append(bookid);
        sb.append(", borrowdata=").append(borrowdata);
        sb.append(", returndata=").append(returndata);
        sb.append(", exceptreturntime=").append(exceptreturntime);
        sb.append(", overdata=").append(overdata);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}