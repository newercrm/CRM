package com.crm.pojo;

public class Client {
    private Long cid;

    private String cname;

    private String cEid;

    private Long cAid;

    private Integer cstate;

    private Long ctel;

    private String caddress;

    private Long cqq;

    private String cemail;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getcEid() {
        return cEid;
    }

    public void setcEid(String cEid) {
        this.cEid = cEid == null ? null : cEid.trim();
    }

    public Long getcAid() {
        return cAid;
    }

    public void setcAid(Long cAid) {
        this.cAid = cAid;
    }

    public Integer getCstate() {
        return cstate;
    }

    public void setCstate(Integer cstate) {
        this.cstate = cstate;
    }

    public Long getCtel() {
        return ctel;
    }

    public void setCtel(Long ctel) {
        this.ctel = ctel;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public Long getCqq() {
        return cqq;
    }

    public void setCqq(Long cqq) {
        this.cqq = cqq;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail == null ? null : cemail.trim();
    }
}