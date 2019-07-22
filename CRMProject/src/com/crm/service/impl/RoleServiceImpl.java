package com.crm.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.RoleMapper;
import com.crm.pojo.Role;
import com.crm.service.RoleService;

@Service
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class RoleServiceImpl implements RoleService{
	private static Logger log = LogManager.getLogger();
	@Autowired
	private RoleMapper roleMapper;
		
	public List<Role> selectAllTeacher(){
		
		return roleMapper.findAllRole();
	}
}
