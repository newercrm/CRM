package com.crm.pojo;

import java.util.Date;

public class Log {
    private Long lid;

    private String logmessage;

    private Long lEid;

    private Date logtime;

    private Date starttime;

    private Date endtime;

    private Integer lstate;

    private Long lCid;
    
    private Emp emp;
    

    public Log() {
		
	}

	public Log(Long lid, String logmessage, Long lEid, Date logtime, Date starttime, Date endtime, Integer lstate,
			Long lCid, Emp emp) {
		this.lid = lid;
		this.logmessage = logmessage;
		this.lEid = lEid;
		this.logtime = logtime;
		this.starttime = starttime;
		this.endtime = endtime;
		this.lstate = lstate;
		this.lCid = lCid;
		this.emp = emp;
	}

	public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public String getLogmessage() {
        return logmessage;
    }

    public void setLogmessage(String logmessage) {
        this.logmessage = logmessage == null ? null : logmessage.trim();
    }

    public Long getlEid() {
        return lEid;
    }

    public void setlEid(Long lEid) {
        this.lEid = lEid;
    }

    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getLstate() {
        return lstate;
    }

    public void setLstate(Integer lstate) {
        this.lstate = lstate;
    }

    public Long getlCid() {
        return lCid;
    }

    public void setlCid(Long lCid) {
        this.lCid = lCid;
    }

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Log [lid=" + lid + ", logmessage=" + logmessage + ", lEid=" + lEid + ", logtime=" + logtime
				+ ", starttime=" + starttime + ", endtime=" + endtime + ", lstate=" + lstate + ", lCid=" + lCid
				+ ", emp=" + emp + ", hashCode()=" + hashCode() + "]";
	}
    


    
}