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
    
    private Area area;
    

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

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
			String cqq, String cemail, Area area) {
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
		this.area = area;
	}

	public Client() {
		super();
	}

	@Override
	public String toString() {
		return "Client [cid=" + cid + ", cname=" + cname + ", cEid=" + cEid + ", cAid=" + cAid + ", cstate=" + cstate
				+ ", ctel=" + ctel + ", caddress=" + caddress + ", cqq=" + cqq + ", cemail=" + cemail + ", area=" + area
				+ ", getArea()=" + getArea() + ", getCid()=" + getCid() + ", getCname()=" + getCname() + ", getcEid()="
				+ getcEid() + ", getcAid()=" + getcAid() + ", getCstate()=" + getCstate() + ", getCtel()=" + getCtel()
				+ ", getCaddress()=" + getCaddress() + ", getCqq()=" + getCqq() + ", getCemail()=" + getCemail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

   
}