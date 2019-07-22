package com.crm.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.crm.dao.ClientMapper;
import com.crm.pojo.Client;
import com.crm.pojo.Emp;
@Repository
public class ClientMapperImpl extends SqlSessionDaoSupport implements ClientMapper {
	
	private static final String ANMESPACE = "com.crm.dao.ClientMapper.";

	// 注入模板类
	@Autowired
	public void init(SqlSessionTemplate sessionTemplate) {
		this.setSqlSessionTemplate(sessionTemplate);
	}

	@Override
	public List<Client> findNameTel(Long cid) {
		// TODO Auto-generated method stub
		return this.getSqlSessionTemplate().selectList(changeToNameSpace("findNameTel"), cid);
	}

	private static String changeToNameSpace(String methodName) {
		return ANMESPACE + methodName;
	}

}
