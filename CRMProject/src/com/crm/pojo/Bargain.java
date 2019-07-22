package com.crm.pojo;

import java.util.Date;

public class Bargain {
    private String bid;

    private String bmessage;

    private Integer bstate;

    private Long bCid;

    private Date btime;

    private Date bendtime;

    private Long bEid;

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    public String getBmessage() {
        return bmessage;
    }

    public void setBmessage(String bmessage) {
        this.bmessage = bmessage == null ? null : bmessage.trim();
    }

    public Integer getBstate() {
        return bstate;
    }

    public void setBstate(Integer bstate) {
        this.bstate = bstate;
    }

    public Long getbCid() {
        return bCid;
    }

    public void setbCid(Long bCid) {
        this.bCid = bCid;
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public Date getBendtime() {
        return bendtime;
    }

    public void setBendtime(Date bendtime) {
        this.bendtime = bendtime;
    }

    public Long getbEid() {
        return bEid;
    }

    public void setbEid(Long bEid) {
        this.bEid = bEid;
    }
}