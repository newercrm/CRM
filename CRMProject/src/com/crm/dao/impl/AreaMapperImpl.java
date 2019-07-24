package com.crm.dao.impl;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crm.dao.AreaMapper;
import com.crm.pojo.Area;
import com.crm.pojo.Emp;
@Repository
public class AreaMapperImpl extends SqlSessionDaoSupport implements  AreaMapper {
	private static final String ANMESPACE = "com.crm.dao.AreaMapper.";
	private static Logger log=LogManager.getLogger();
	
	//注入模板类
	@Autowired
	public void init(SqlSessionTemplate sessionTemplate) {
		this.setSqlSessionTemplate(sessionTemplate);
	}
	
	private static String changeToNameSpace(String methodName) {
        return ANMESPACE + methodName;
    }
	
	@Override
	public Area findAreaNameByID(Emp emp) {
		Area area=this.getSqlSessionTemplate().selectOne(changeToNameSpace("findAreaNameByID"), emp);
		return area;
	}

	@Override
	public Area findAreaNameByParentId(Area area) {
		Area ar=this.getSqlSessionTemplate().selectOne(changeToNameSpace("findAreaNameByParentId"), area);
		return ar;
	}
}
