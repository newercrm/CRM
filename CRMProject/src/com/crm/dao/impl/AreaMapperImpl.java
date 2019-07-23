package com.crm.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crm.dao.AreaMapper;
import com.crm.dao.EmpMapper;
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
	public Long findParentidByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Area findAreaNameByParentidID() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		AreaMapperImpl dao=new AreaMapperImpl();
		Area area=dao.findAreaNameByID(new Emp(5L,"","","",0L,2L,0,new Date()));
		System.out.println(area);
	}
}
