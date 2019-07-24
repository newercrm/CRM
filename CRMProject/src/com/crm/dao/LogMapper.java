package com.crm.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.type.JdbcType;

import com.crm.pojo.Client;
import com.crm.pojo.Emp;
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
			@Result(column = "L_EID",jdbcType = JdbcType.BIGINT,property = "lEid",javaType = Long.class),
			@Result(column = "L_CID",jdbcType = JdbcType.BIGINT,property = "lCid",javaType = Long.class),
			@Result(column = "L_EID",property="emp",one=@One(select = "com.crm.dao.EmpMapper.findLogToEmp")),
			@Result(column = "L_CID",property="client",one=@One(select = "com.crm.dao.ClientMapper.findNameTel")),			
	})
	public List<Log> findAllLog();
	

	/*
	 * 经理员工添加日志
	 */
	@Insert("insert into log(logmessage,l_eid,logtime,starttime,endtime,lstate,l_cid) VALUES(#{logmessage,jdbcType=VARCHAR},#{lEid,jdbcType=BIGINT},#{logtime,jdbcType=TIMESTAMP},#{starttime,jdbcType=TIMESTAMP},#{endtime,jdbcType=TIMESTAMP},0,#{lCid,jdbcType=BIGINT})")
	@Options(keyColumn="lid",keyProperty="lid",useGeneratedKeys=true)
	@SelectKey (statement = "select LAST_INSERT_ID() from DUAL",keyColumn="lid",keyProperty="lid",resultType = Long.class,before = false)
	public int addAllLog(Log log);
	
	@Select("select cid from client where cname = #{cname,jdbcType=VARCHAR} and ctel = #{ctel,jdbcType=VARCHAR}")
	@Results(id="findClientIdMap",value= {
			@Result(id = true,column="CID",jdbcType=JdbcType.BIGINT,property="cid",javaType=Long.class)
	})
	public int findClientId(Map<String,String> map);
}
