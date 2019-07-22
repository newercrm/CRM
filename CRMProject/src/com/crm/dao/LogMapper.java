package com.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


import com.crm.pojo.Log;

public interface LogMapper {
	@Select("")
	@Results(id="LogResultMap",value = {
//			@Result(id=true,column = "TID",jdbcType = JdbcType.BIGINT,property = "tid",javaType = Long.class),
//			@Result(column = "TNAME",jdbcType = JdbcType.VARCHAR,property = "tname",javaType = String.class),
//			@Result(column = "SUBJECT",jdbcType = JdbcType.VARCHAR,property = "subject",javaType = String.class)
		})
	List<Log> findAllLog();
}
