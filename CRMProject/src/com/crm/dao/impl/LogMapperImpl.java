package com.crm.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.crm.dao.LogMapper;
import com.crm.pojo.Client;
import com.crm.pojo.Emp;
import com.crm.pojo.Log;
import com.crm.pojo.Role;

@Repository
public class LogMapperImpl extends SqlSessionDaoSupport implements LogMapper {
	private static final String ANMESPACE = "com.crm.dao.LogMapper.";

	// 注入模板类
	@Autowired
	public void init(SqlSessionTemplate sessionTemplate) {
		this.setSqlSessionTemplate(sessionTemplate);
	}
	
	private static String changeToNameSpace(String methodName) {
		return ANMESPACE + methodName;
	}
	
	@Override
	public List<Log> findAllLog() {
		List<Log> list = this.getSqlSessionTemplate().selectList(changeToNameSpace("findAllLog"));
		return list;
	}
	
	@Override
	public int addAllLog(Log log) {
		int num = this.getSqlSessionTemplate().insert(changeToNameSpace("addAllLog"), log);
		return num;
	}

	@Override
	public int findClientId(Map<String,String> map) {
		int cid = this.getSqlSessionTemplate().selectOne("findClientId", map);
		return cid;
	}
}
