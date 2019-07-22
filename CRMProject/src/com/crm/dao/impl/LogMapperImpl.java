package com.crm.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.crm.dao.LogMapper;
import com.crm.pojo.Log;
import com.crm.pojo.Role;
@Configuration
public class LogMapperImpl extends SqlSessionDaoSupport implements LogMapper {
private static final String ANMESPACE = "com.crm.dao.LogMapper.";
	
	//注入模板类
	@Autowired
	public void init(SqlSessionTemplate sessionTemplate) {
		this.setSqlSessionTemplate(sessionTemplate);
	}
	
	@Override
	public List<Log> findAllLog() {
		List<Log> list = this.getSqlSessionTemplate().selectList(changeToNameSpace("findAllLog"));
		return list;
	}

	
	private static String changeToNameSpace(String methodName) {
        return ANMESPACE + methodName;
    }
	
	
}
