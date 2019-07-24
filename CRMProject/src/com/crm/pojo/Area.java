package com.crm.pojo;

import java.util.List;

public class Area {
    private Long aid;

    private String areaname;

    private Long parentid;
    
    private List<Emp> list;
    
    private Area area;
    
    public Area() {
		super();
	}
    
	public Area(Long aid, String areaname, Long parentid) {
		super();
		this.aid = aid;
		this.areaname = areaname;
		this.parentid = parentid;
	}
	
	public Area(Long aid, String areaname, Long parentid, List<Emp> list, Area area) {
		super();
		this.aid = aid;
		this.areaname = areaname;
		this.parentid = parentid;
		this.list = list;
		this.area = area;
	}
	
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public List<Emp> getList() {
		return list;
	}

	public void setList(List<Emp> list) {
		this.list = list;
	}

	public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

	@Override
	public String toString() {
		return "Area [aid=" + aid + ", areaname=" + areaname + ", parentid=" + parentid + ", list=" + list + ", area="
				+ area + "]";
	}

}