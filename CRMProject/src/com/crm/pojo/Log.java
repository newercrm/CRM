package com.crm.pojo;

import java.sql.Timestamp;
import java.util.Date;

public class Log {
	// 日志id
	private Long lid;
	// 日志信息
	private String logmessage;
	// 所属员工id
	private Long lEid;
	// 创建时间
	private Timestamp logtime;
	// 设定开始时间
	private Timestamp starttime;
	// 设定结束时间
	private Timestamp endtime;
	// 日志状态 0 未完成 ， 1 已完成
	private Integer lstate;
	// 指定客户id
	private Long lCid;

	// 员工与客户对象
	private Emp emp;
	private Client client;
	
	private Log log;

	public Log() {

	}

	public Log(Long lid, String logmessage, Long lEid, Timestamp logtime, Timestamp starttime, Timestamp endtime,
			Integer lstate, Long lCid, Emp emp, Client client) {
		super();
		this.lid = lid;
		this.logmessage = logmessage;
		this.lEid = lEid;
		this.logtime = logtime;
		this.starttime = starttime;
		this.endtime = endtime;
		this.lstate = lstate;
		this.lCid = lCid;
		this.emp = emp;
		this.client = client;
	}

	public Long getlEid() {
		return lEid;
	}

	public void setlEid(Long lEid) {
		this.lEid = lEid;
	}

	public Long getlCid() {
		return lCid;
	}

	public void setlCid(Long lCid) {
		this.lCid = lCid;
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

	public Emp getEmp() {
		return emp;
	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
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
		return "Log [lid=" + lid + ", logmessage=" + logmessage + ", lEid=" + lEid + ", logtime=" + logtime
				+ ", starttime=" + starttime + ", endtime=" + endtime + ", lstate=" + lstate + ", lCid=" + lCid
				+ ", emp=" + emp + ", client=" + client + ", hashCode()=" + hashCode() + "]";
	}

}