package com.crm.dao.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crm.dao.RoleMapper;
import com.crm.pojo.Role;

@Repository
public class RoleMapperImpl extends SqlSessionDaoSupport  implements RoleMapper{
	private static final String ANMESPACE = "com.crm.dao.RoleMapper.";
	
	//注入模板类
	@Autowired
	public void init(SqlSessionTemplate sessionTemplate) {
		this.setSqlSessionTemplate(sessionTemplate);
	}
	
	@Override
	public List<Role> findAllRole() {
		List<Role> list =this.getSqlSessionTemplate().selectList(changeToNameSpace("findAllRole"));
		return list;
	}
	
	private static String changeToNameSpace(String methodName) {
        return ANMESPACE + methodName;
    }

}
