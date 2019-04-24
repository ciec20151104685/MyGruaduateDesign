package com.persistence.entity;

import java.io.Serializable;

public class Book implements Serializable {
    private Integer bookid;

    private String bookdetil;

    private String bookname;

    private String bookauthor;

    private Integer bookstatus;

    private static final long serialVersionUID = 1L;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookdetil() {
        return bookdetil;
    }

    public void setBookdetil(String bookdetil) {
        this.bookdetil = bookdetil == null ? null : bookdetil.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor == null ? null : bookauthor.trim();
    }

    public Integer getBookstatus() {
        return bookstatus;
    }

    public void setBookstatus(Integer bookstatus) {
        this.bookstatus = bookstatus;
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
        Book other = (Book) that;
        return (this.getBookid() == null ? other.getBookid() == null : this.getBookid().equals(other.getBookid()))
            && (this.getBookdetil() == null ? other.getBookdetil() == null : this.getBookdetil().equals(other.getBookdetil()))
            && (this.getBookname() == null ? other.getBookname() == null : this.getBookname().equals(other.getBookname()))
            && (this.getBookauthor() == null ? other.getBookauthor() == null : this.getBookauthor().equals(other.getBookauthor()))
            && (this.getBookstatus() == null ? other.getBookstatus() == null : this.getBookstatus().equals(other.getBookstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookid() == null) ? 0 : getBookid().hashCode());
        result = prime * result + ((getBookdetil() == null) ? 0 : getBookdetil().hashCode());
        result = prime * result + ((getBookname() == null) ? 0 : getBookname().hashCode());
        result = prime * result + ((getBookauthor() == null) ? 0 : getBookauthor().hashCode());
        result = prime * result + ((getBookstatus() == null) ? 0 : getBookstatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookid=").append(bookid);
        sb.append(", bookdetil=").append(bookdetil);
        sb.append(", bookname=").append(bookname);
        sb.append(", bookauthor=").append(bookauthor);
        sb.append(", bookstatus=").append(bookstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}