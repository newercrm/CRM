package com.crm.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.type.JdbcType;

import com.crm.pojo.Client;
import com.crm.pojo.Emp;
import com.crm.pojo.Log;

public interface LogMapper {
	/*
	 * 经理查所有
	 */
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
	 * 员工根据id查询
	 */
	@Select("select lid,logmessage,logtime,starttime,endtime,lstate,l_cid from log where l_eid = #{lEid,jdbcType=BIGINT}")
	@Results(id="LogResultMapById",value = {
			@Result(id=true,column = "LID",jdbcType = JdbcType.BIGINT,property = "lid",javaType = Long.class),
			@Result(column = "LOGMESSAGE",jdbcType = JdbcType.VARCHAR,property = "logmessage",javaType = String.class),
			@Result(column = "LOGTIME",jdbcType = JdbcType.TIMESTAMP,property = "logtime",javaType = Timestamp.class),
			@Result(column = "STARTTIME",jdbcType = JdbcType.TIMESTAMP,property = "starttime",javaType = Timestamp.class),
			@Result(column = "ENDTIME",jdbcType = JdbcType.TIMESTAMP,property = "endtime",javaType = Timestamp.class),
			@Result(column = "LSTATE",jdbcType = JdbcType.INTEGER,property = "lstate",javaType = Integer.class),
			@Result(column = "L_CID",jdbcType = JdbcType.BIGINT,property = "lCid",javaType = Long.class),
			@Result(column = "L_CID",property="client",one=@One(select = "com.crm.dao.ClientMapper.findNameTel")),			
	})
	public List<Log> findLogById(Log log);
	
	/*
	 * 模糊查询根据客户名称，概要，创建人，以及完成情况
	 */
	@SelectProvider(type=SqlFindLogSub.class,method="findLogClass")
	@ResultMap(value="LogResultMap")
	public List<Log> findLogByClass(Log log);
	
	//根据填写的客户姓名查出该客户id
	@Select("select cid from client where cname = #{cname,jdbcType=VARCHAR}")
	@Results(id="findLogIdByClientName",value= {
			@Result(id = true,column="CID",jdbcType=JdbcType.BIGINT,property="cid",javaType=Long.class)
	})
	public int findLogByClientName(String cname);
	
	
	//根据填写的员工姓名查出该员工id
	@Select("select eid from emp where ename = #{ename,jdbcType=VARCHAR}")
	@Results(id="findLogIdByLogName",value= {
			@Result(id = true,column="EID",jdbcType=JdbcType.BIGINT,property="eid",javaType=Long.class)
	})
	public int findLogByEmpName(String name);
	
	/*
	 * 经理员工添加日志
	 */
	@Insert("insert into log(logmessage,l_eid,logtime,starttime,endtime,lstate,l_cid) VALUES(#{logmessage,jdbcType=VARCHAR},#{lEid,jdbcType=BIGINT},#{logtime,jdbcType=TIMESTAMP},#{starttime,jdbcType=TIMESTAMP},#{endtime,jdbcType=TIMESTAMP},0,#{lCid,jdbcType=BIGINT})")
	@Options(keyColumn="lid",keyProperty="lid",useGeneratedKeys=true)
	@SelectKey (statement = "select LAST_INSERT_ID() from DUAL",keyColumn="lid",keyProperty="lid",resultType = Long.class,before = false)
	public int addAllLog(Log log);
	
	/*
	 * 添加时根据填入的客户姓名和电话查询客户id
	 */
	@SelectProvider(type=SqlFindLogSub.class,method="findLoglCidByName")
	@Results(id="findClientIdMap",value= {
			@Result(id = true,column="CID",jdbcType=JdbcType.BIGINT,property="cid",javaType=Long.class)
	})
	public int findClientId(Map<String,String> map);
	
	/*
	 * 添加时根据填入的员工姓名和电话查询员工id
	 */
	@SelectProvider(type=SqlFindLogSub.class,method="findLoglEidByName")
	@Results(id="findEmpIdMap",value= {
			@Result(id = true,column="EID",jdbcType=JdbcType.BIGINT,property="eid",javaType=Long.class)
	})
	public int findEmpId(Map<String,String> map);
	
	
	//经理员工修改日志基本信息
	@UpdateProvider(type=SqlFindLogSub.class,method="updateLogMessage")
	public int updateLogByClientAndSuper(Log log);
	
	//删除日志
	@Delete("delete from log where lid = #{lid,jdbcType=BIGINT}")
	public int deleteLogByLid(Log log);
	

	
}
