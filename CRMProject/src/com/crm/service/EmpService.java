package com.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crm.pojo.Emp;


public interface EmpService {
	
	public List<Emp> findAllEmp();
}
