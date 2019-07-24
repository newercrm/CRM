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
		return empMapper.findAllEmp();
	}
	
	@Override
	public List<Emp> findEmpByAid(String aid){
		return empMapper.findEmpByAid(aid);
	}

	@Override
	public List<Emp> findEmpByEid(String eid) {
		return empMapper.findEmpByID(eid);
	}

	@Override
	public List<Emp> findEmpByEtel(String etel) {
		return empMapper.findEmpByEtel(etel);
	}

	@Override
	public List<Emp> findEmpByEname(String ename) {
		return empMapper.findEmpByEname(ename);
	}

	@Override
	public List<Emp> findQuitEmp() {
		return empMapper.findQuitEmp();
	}

}
