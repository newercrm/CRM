package com.crm.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.dao.EmpMapper;
import com.crm.pojo.Emp;
import com.crm.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{
	private static Logger log = LogManager.getLogger();
	@Autowired
	private EmpMapper empMapper;
	
	@Override
	public List<Emp> findAllEmp() {
		log.debug("EmpServiceImpl");
		return empMapper.findAllEmp();
	}

}
