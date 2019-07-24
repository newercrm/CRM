package com.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crm.pojo.Emp;


public interface EmpService {
	
	public List<Emp> findAllEmp();
	
	public List<Emp> findEmpByAid(String aid);
	
	public List<Emp> findEmpByEid(String eid);
	
	public List<Emp> findEmpByEtel(String etel);
	
	public List<Emp> findEmpByEname(String ename);
	
	public List<Emp> findQuitEmp();
	
	
	
}
