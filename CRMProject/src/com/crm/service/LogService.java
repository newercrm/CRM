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
	
}
