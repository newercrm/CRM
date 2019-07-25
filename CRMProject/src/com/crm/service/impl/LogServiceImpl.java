package com.crm.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.LogMapper;
import com.crm.pojo.Client;
import com.crm.pojo.Emp;
import com.crm.pojo.Log;
import com.crm.service.LogService;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
public class LogServiceImpl implements LogService {
	private static Logger log = LogManager.getLogger();

	@Autowired
	private LogMapper logMapper;

	@Override
	public List<Log> findAllLog() {
		List<Log> list = logMapper.findAllLog();
		return list;
	}

	@Override
	public int addAllLog(Log log) {
		int num = logMapper.addAllLog(log);
		return num;
	}

	@Override
	public int findClientId(Map<String, String> map) {
		int cid = logMapper.findClientId(map);
		return cid;
	}

	@Override
	public List<Log> findLogById(Log log) {
		List<Log> list = logMapper.findLogById(log);
		return list;
	}

	@Override
	public int findLogByClientName(String cname) {
		int cid = logMapper.findLogByClientName(cname);
		return cid;
	}

	@Override
	public int findLogByEmpName(String name) {
		int eid = logMapper.findLogByEmpName(name);
		return eid;
	}

	@Override
	public List<Log> findLogByClass(Log log) {
		List<Log> list = logMapper.findLogByClass(log);
		return list;
	}

	@Override
	public int updateLogByClientAndSuper(Log log) {
		int num = logMapper.updateLogByClientAndSuper(log);
		return num;
	}

	@Override
	public int findEmpId(Map<String, String> map) {
		int eid = logMapper.findEmpId(map);
		return eid;
	}

	@Override
	public int deleteLogByLid(Log log) {
		int num = logMapper.deleteLogByLid(log);
		return num;
	}
}
