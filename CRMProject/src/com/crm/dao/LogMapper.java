package com.crm.dao;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.crm.pojo.Log;

public interface LogMapper {
	@Select("select lid,logmessage,logtime,starttime,endtime,lstate,l_eid,l_cid from log")
	@Results(id="LogResultMap",value = {
			@Result(id=true,column = "LID",jdbcType = JdbcType.BIGINT,property = "lid",javaType = Long.class),
			@Result(column = "LOGMESSAGE",jdbcType = JdbcType.VARCHAR,property = "logmessage",javaType = String.class),
			@Result(column = "LOGTIME",jdbcType = JdbcType.TIMESTAMP,property = "logtime",javaType = Timestamp.class),
			@Result(column = "STARTTIME",jdbcType = JdbcType.TIMESTAMP,property = "starttime",javaType = Timestamp.class),
			@Result(column = "ENDTIME",jdbcType = JdbcType.TIMESTAMP,property = "endtime",javaType = Timestamp.class),
			@Result(column = "LSTATE",jdbcType = JdbcType.INTEGER,property = "lstate",javaType = Integer.class),
			@Result(column = "L_EID",jdbcType = JdbcType.BIGINT,property = "l_eid",javaType = Long.class),
			@Result(column = "L_CID",jdbcType = JdbcType.BIGINT,property = "l_cid",javaType = Long.class),
			@Result(column = "L_EID",property="emp",one=@One(select = "com.crm.dao.EmpMapper.findLogToEmp")),
			@Result(column = "L_CID",property="client",one=@One(select = "com.crm.dao.ClientMapper.findNameTel")),			
	})
	List<Log> findAllLog();
}
