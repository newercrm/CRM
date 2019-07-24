package com.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.type.JdbcType;

import com.crm.pojo.Emp;

public interface EmpMapper {
	// 查看日志的作者
	@Select("select ename,etel from emp where eid = #{eid,jdbcType = BIGINT}")
	@Results(id = "findEname", value = {
			@Result(column = "ENAME", jdbcType = JdbcType.VARCHAR, property = "ename", javaType = String.class),
			@Result(column = "ETEL", jdbcType = JdbcType.VARCHAR, property = "etel", javaType = String.class) })
	public List<Emp> findLogToEmp(Long eid);

	// 根据id查询员工
	@Select("select eid,ename,etel,estate,ebirthday,e_aid from emp where eid=#{eid} and e_rid = 2 and estate = 1")
	@Results(id = "empResultMap", value = {
			@Result(id = true, column = "eid", jdbcType = JdbcType.BIGINT, property = "eid", javaType = Long.class),
			@Result(column = "ename", jdbcType = JdbcType.VARCHAR, property = "ename", javaType = String.class),
			@Result(column = "etel", jdbcType = JdbcType.VARCHAR, property = "etel", javaType = String.class),
			@Result(column = "estate", jdbcType = JdbcType.INTEGER, property = "estate", javaType = Integer.class),
			@Result(column = "ebirthday", jdbcType = JdbcType.DATE, property = "ebirthday", javaType = java.sql.Date.class),
			@Result(column = "e_aid", jdbcType = JdbcType.BIGINT, property = "eAid", javaType = Long.class),
			@Result(column = "e_aid", property = "area1", one = @One(select = "com.crm.dao.AreaMapper.findAreaNameByID")) })
	public List<Emp> findEmpByID(String eid);

	// 分页查看销售主管的信息
	@Select("select eid,ename,etel,estate,ebirthday,e_aid from emp where e_rid=2 and estate = 1")
	@Results(id = "empToAreaResultMap", value = {
			@Result(id = true, column = "eid", jdbcType = JdbcType.BIGINT, property = "eid", javaType = Long.class),
			@Result(column = "ename", jdbcType = JdbcType.VARCHAR, property = "ename", javaType = String.class),
			@Result(column = "etel", jdbcType = JdbcType.VARCHAR, property = "etel", javaType = String.class),
			@Result(column = "estate", jdbcType = JdbcType.INTEGER, property = "estate", javaType = Integer.class),
			@Result(column = "ebirthday", jdbcType = JdbcType.DATE, property = "ebirthday", javaType = java.sql.Date.class),
			@Result(column = "e_aid", jdbcType = JdbcType.BIGINT, property = "eAid", javaType = Long.class),
			@Result(column = "e_aid", property = "area1", one = @One(select = "com.crm.dao.AreaMapper.findAreaNameByID")) })
	public List<Emp> findAllEmp();

	// 根据员工所属地区查看员工信息
	@Select("select eid,ename,etel,estate,ebirthday from emp where e_aid=#{aid} and e_rid=2 and estate = 1")
	@Results(id = "empByAidResultMap", value = {
			@Result(id = true, column = "eid", jdbcType = JdbcType.BIGINT, property = "eid", javaType = Long.class),
			@Result(column = "ename", jdbcType = JdbcType.VARCHAR, property = "ename", javaType = String.class),
			@Result(column = "etel", jdbcType = JdbcType.VARCHAR, property = "etel", javaType = String.class),
			@Result(column = "estate", jdbcType = JdbcType.INTEGER, property = "estate", javaType = Integer.class),
			@Result(column = "ebirthday", jdbcType = JdbcType.DATE, property = "ebirthday", javaType = java.sql.Date.class) })
	public List<Emp> findEmpByAid(String aid);

	// 根据电话号码查询员工信息
	@Select("select eid,ename,etel,estate,ebirthday,e_aid from emp where etel=#{etel} and e_rid=2 and estate = 1")
	@ResultMap(value="empResultMap")
	public List<Emp> findEmpByEtel(String etel);
	
	// 根据员工姓名模糊查询员工信息
	@Select("select eid,ename,etel,estate,ebirthday,e_aid from emp where ename like concat('%',#{name},'%') and e_rid = 2 and estate = 1")
	@ResultMap(value="empResultMap")
	public List<Emp> findEmpByEname(String ename);
	
	// 查看离职员工
	@Select("select eid,ename,etel,estate,ebirthday,e_aid from emp where estate = 0")
	@ResultMap(value="empResultMap")
	public List<Emp> findQuitEmp();
		
	// 增加员工(新员工入职)

}
