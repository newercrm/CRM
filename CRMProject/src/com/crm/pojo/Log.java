package com.crm.pojo;

import java.sql.Timestamp;
import java.util.Date;

public class Log {
	// 日志id
	private Long lid;
	// 日志信息
	private String logmessage;
	// 所属员工id
	private Long l_eid;
	// 创建时间
	private Timestamp logtime;
	// 设定开始时间
	private Timestamp starttime;
	// 设定结束时间
	private Timestamp endtime;
	// 日志状态 0 未完成 ， 1 已完成
	private Integer lstate;
	// 指定客户id
	private Long l_cid;

	// 员工与客户对象
	private Emp emp;
	private Client client;
	
	public Log() {
		
	}
	public Log(Long lid, String logmessage, Long l_eid, Timestamp logtime, Timestamp starttime, Timestamp endtime,
			Integer lstate, Long l_cid, Emp emp, Client client) {
		super();
		this.lid = lid;
		this.logmessage = logmessage;
		this.l_eid = l_eid;
		this.logtime = logtime;
		this.starttime = starttime;
		this.endtime = endtime;
		this.lstate = lstate;
		this.l_cid = l_cid;
		this.emp = emp;
		this.client = client;
	}



	public String getLogmessage() {
		return logmessage;
	}



	public void setLogmessage(String logmessage) {
		this.logmessage = logmessage;
	}



	public Long getLid() {
		return lid;
	}

	public void setLid(Long lid) {
		this.lid = lid;
	}

	public Long getL_eid() {
		return l_eid;
	}

	public void setL_eid(Long l_eid) {
		this.l_eid = l_eid;
	}

	public Timestamp getLogtime() {
		return logtime;
	}

	public void setLogtime(Timestamp logtime) {
		this.logtime = logtime;
	}

	public Timestamp getStarttime() {
		return starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public Integer getLstate() {
		return lstate;
	}

	public void setLstate(Integer lstate) {
		this.lstate = lstate;
	}

	public Long getL_cid() {
		return l_cid;
	}

	public void setL_cid(Long l_cid) {
		this.l_cid = l_cid;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "Log [lid=" + lid + ", logmessage=" + logmessage + ", l_eid=" + l_eid + ", logtime=" + logtime
				+ ", starttime=" + starttime + ", endtime=" + endtime + ", lstate=" + lstate + ", l_cid=" + l_cid
				+ ", emp=" + emp + ", client=" + client + "]";
	}


	

}