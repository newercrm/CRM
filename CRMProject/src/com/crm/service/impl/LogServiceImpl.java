package com.crm.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.LogMapper;
import com.crm.dao.RoleMapper;
import com.crm.pojo.Log;
import com.crm.service.LogService;

@Service
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class LogServiceImpl implements LogService {
	private static Logger log = LogManager.getLogger();
	
	@Autowired
	 private LogMapper logMapper;
	
	@Override
	public List<Log> findAllLog() {
		// TODO Auto-generated method stub
		return null;
	}

}
