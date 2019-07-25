package com.crm.pojo;

import java.util.Date;
import java.util.List;

public class Emp {
    private Long eid;

    private String epass;

    private String ename;

    private String etel;

    private Long eRid;

    private Long eAid;

    private Integer estate;

    private Area area;
    
    private Date ebirthday;
    
    
    public Emp() {
		super();
	}
    
	public Emp(Long eid, String epass, String ename, String etel, Long eRid, Long eAid, Integer estate, Date ebirthday) {
		super();
		this.eid = eid;
		this.epass = epass;
		this.ename = ename;
		this.etel = etel;
		this.eRid = eRid;
		this.eAid = eAid;
		this.estate = estate;
		this.ebirthday = ebirthday;
	}

	public Emp(Long eid, String epass, String ename, String etel, Long eRid, Long eAid, Integer estate, Area area,
			Date ebirthday) {
		super();
		this.eid = eid;
		this.epass = epass;
		this.ename = ename;
		this.etel = etel;
		this.eRid = eRid;
		this.eAid = eAid;
		this.estate = estate;
		this.area = area;
		this.ebirthday = ebirthday;
	}


	public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public String getEpass() {
        return epass;
    }

    public void setEpass(String epass) {
        this.epass = epass == null ? null : epass.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEtel() {
        return etel;
    }

    public void setEtel(String etel) {
        this.etel = etel;
    }

    public Long geteRid() {
        return eRid;
    }

    public void seteRid(Long eRid) {
        this.eRid = eRid;
    }

    public Long geteAid() {
        return eAid;
    }

    public void seteAid(Long eAid) {
        this.eAid = eAid;
    }

    public Integer getEstate() {
        return estate;
    }

    public void setEstate(Integer estate) {
        this.estate = estate;
    }

    public Date getEbirthday() {
        return ebirthday;
    }

    public void setEbirthday(Date ebirthday) {
        this.ebirthday = ebirthday;
    }

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", epass=" + epass + ", ename=" + ename + ", etel=" + etel + ", eRid=" + eRid
				+ ", eAid=" + eAid + ", estate=" + estate + ", area=" + area + ", ebirthday=" + ebirthday
				+ ", hashCode()=" + hashCode() + "]";
	}
    
}