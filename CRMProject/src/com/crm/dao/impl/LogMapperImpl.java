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
	public int findClientId(Map<String, String> map) {
		int cid = this.getSqlSessionTemplate().selectOne("findClientId", map);
		return cid;
	}

	@Override
	public List<Log> findLogById(Log log) {
		List<Log> list = this.getSqlSessionTemplate().selectList("findLogById", log);
		return list;
	}

	@Override
	public List<Log> findLogByClass(Log log) {
		List<Log> list = this.getSqlSessionTemplate().selectList("findLogByClass", log);
		return list;
	}

	@Override
	public int findLogByClientName(String cname) {
		int cid = this.getSqlSessionTemplate().selectOne(changeToNameSpace("findLogByClientName"), cname);
		return cid;
	}

	@Override
	public int findLogByEmpName(String name) {
		int eid = this.getSqlSessionTemplate().selectOne("findLogByEmpName", name);
		return eid;
	}

	@Override
	public int updateLogByClientAndSuper(Log log) {
		int num = this.getSqlSessionTemplate().update(changeToNameSpace("updateLogByClientAndSuper"), log);
		return num;
	}

	@Override
	public int findEmpId(Map<String, String> map) {
		int eid = this.getSqlSessionTemplate().selectOne("findEmpId", map);
		return eid;
	}

	@Override
	public int deleteLogByLid(Log log) {
		int num = this.getSqlSessionTemplate().delete("deleteLogByLid", log);
		return num;
	}
}
