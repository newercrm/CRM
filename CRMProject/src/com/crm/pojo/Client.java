package com.crm.pojo;

public class Client {
    private Long cid;

    private String cname;

    private String cEid;

    private Long cAid;

    private Integer cstate;

    private String ctel;

    private String caddress;

    private String cqq;

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
		this.cname = cname;
	}

	public String getcEid() {
		return cEid;
	}

	public void setcEid(String cEid) {
		this.cEid = cEid;
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

	public String getCtel() {
		return ctel;
	}

	public void setCtel(String ctel) {
		this.ctel = ctel;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCqq() {
		return cqq;
	}

	public void setCqq(String cqq) {
		this.cqq = cqq;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public Client(Long cid, String cname, String cEid, Long cAid, Integer cstate, String ctel, String caddress,
			String cqq, String cemail) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cEid = cEid;
		this.cAid = cAid;
		this.cstate = cstate;
		this.ctel = ctel;
		this.caddress = caddress;
		this.cqq = cqq;
		this.cemail = cemail;
	}

	public Client() {
		super();
	}

	@Override
	public String toString() {
		return "Client [cid=" + cid + ", cname=" + cname + ", cEid=" + cEid + ", cAid=" + cAid + ", cstate=" + cstate
				+ ", ctel=" + ctel + ", caddress=" + caddress + ", cqq=" + cqq + ", cemail=" + cemail + "]";
	}

   
}