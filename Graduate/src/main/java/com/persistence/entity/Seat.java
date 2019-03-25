package com.persistence.entity;

import java.io.Serializable;

public class Seat implements Serializable {
    private Integer seatid;

    private Integer floor;

    private String area;

    private Integer identify;

    private Integer status;

    private String susername;

    private String starttime;

    private Integer freetime;

    private Integer savetimes;

    private static final long serialVersionUID = 1L;

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Integer getIdentify() {
        return identify;
    }

    public void setIdentify(Integer identify) {
        this.identify = identify;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername == null ? null : susername.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public Integer getFreetime() {
        return freetime;
    }

    public void setFreetime(Integer freetime) {
        this.freetime = freetime;
    }

    public Integer getSavetimes() {
        return savetimes;
    }

    public void setSavetimes(Integer savetimes) {
        this.savetimes = savetimes;
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
        Seat other = (Seat) that;
        return (this.getSeatid() == null ? other.getSeatid() == null : this.getSeatid().equals(other.getSeatid()))
            && (this.getFloor() == null ? other.getFloor() == null : this.getFloor().equals(other.getFloor()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getIdentify() == null ? other.getIdentify() == null : this.getIdentify().equals(other.getIdentify()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSusername() == null ? other.getSusername() == null : this.getSusername().equals(other.getSusername()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getFreetime() == null ? other.getFreetime() == null : this.getFreetime().equals(other.getFreetime()))
            && (this.getSavetimes() == null ? other.getSavetimes() == null : this.getSavetimes().equals(other.getSavetimes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeatid() == null) ? 0 : getSeatid().hashCode());
        result = prime * result + ((getFloor() == null) ? 0 : getFloor().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getIdentify() == null) ? 0 : getIdentify().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSusername() == null) ? 0 : getSusername().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getFreetime() == null) ? 0 : getFreetime().hashCode());
        result = prime * result + ((getSavetimes() == null) ? 0 : getSavetimes().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seatid=").append(seatid);
        sb.append(", floor=").append(floor);
        sb.append(", area=").append(area);
        sb.append(", identify=").append(identify);
        sb.append(", status=").append(status);
        sb.append(", susername=").append(susername);
        sb.append(", starttime=").append(starttime);
        sb.append(", freetime=").append(freetime);
        sb.append(", savetimes=").append(savetimes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}