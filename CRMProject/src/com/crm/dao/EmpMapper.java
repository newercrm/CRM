package com.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.crm.pojo.Emp;

public interface EmpMapper {
	@Select("select ename,etel from emp where eid = #{eid,jdbcType = BIGINT}")
	@Results(id = "findEname",value= {
			@Result(column="ENAME",jdbcType=JdbcType.VARCHAR,property="ename",javaType=String.class),
			@Result(column="ETEL",jdbcType=JdbcType.VARCHAR,property="etel",javaType=String.class)
	})
	List<Emp> findLogToEmp(Long eid);
}
