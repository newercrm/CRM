package com.crm.service;

import java.util.List;
import java.util.Map;

import com.crm.pojo.Client;
import com.crm.pojo.Emp;
import com.crm.pojo.Log;

public interface LogService {
	public List<Log> findAllLog();
	
	public int addAllLog(Log log);
	
	public int findClientId(Map<String,String> map);
	
	public List<Log> findLogById(Log log);
	
	public int findLogByClientName(String cname);
	
	public int findLogByEmpName(String name);
	
	public List<Log> findLogByClass(Log log);
	
	public int updateLogByClientAndSuper(Log log);
	
	public int findEmpId(Map<String, String> map);
	
	public int deleteLogByLid(Log log);
}
