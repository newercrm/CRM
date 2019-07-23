package com.crm.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.crm.dao.EmpMapper;
import com.crm.pojo.Emp;
@Repository
public class EmpMapperImpl extends SqlSessionDaoSupport implements EmpMapper {

	private static final String ANMESPACE = "com.crm.dao.EmpMapper.";

	// 注入模板类
	@Autowired
	public void init(SqlSessionTemplate sessionTemplate) {
		this.setSqlSessionTemplate(sessionTemplate);
	}

	@Override
	public List<Emp> findLogToEmp(Long eid) {
		List<Emp> list = this.getSqlSessionTemplate().selectList(changeToNameSpace("findLogToEmp"), eid);
		return list;
	}

	private static String changeToNameSpace(String methodName) {
		return ANMESPACE + methodName;
	}
	
	@Override
	public List<Emp> findAllEmp() {
		List<Emp> list = this.getSqlSessionTemplate().selectList(changeToNameSpace("findAllEmp"));
		return list;
	}

	@Override
	public List<Emp> findEmpByID(Emp emp) {
		List<Emp> list = this.getSqlSessionTemplate().selectList(changeToNameSpace("findEmpByID"),emp.getEid());
		return list;
	}
}
