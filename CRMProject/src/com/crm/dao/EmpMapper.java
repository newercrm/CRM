package com.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.type.JdbcType;

import com.crm.pojo.Emp;

public interface EmpMapper {
	@Select("select ename,etel from emp where eid = #{eid,jdbcType = BIGINT}")
	@Results(id = "findEname",value= {
			@Result(column="ENAME",jdbcType=JdbcType.VARCHAR,property="ename",javaType=String.class),
			@Result(column="ETEL",jdbcType=JdbcType.VARCHAR,property="etel",javaType=String.class)
	})
	public List<Emp> findLogToEmp(Long eid);
	
	//根据id查询员工
		@Select("select eid,ename,etel,estate,ebirthday,e_aid from emp where eid=#{eid,jdbcType=BIGINT}")
		@Results(id="empResultMap",value= {
				@Result(id=true,column="eid",jdbcType=JdbcType.BIGINT,property="eid",javaType=Long.class),
				@Result(column="ename",jdbcType=JdbcType.VARCHAR,property="ename",javaType=String.class),
				@Result(column="etel",jdbcType=JdbcType.VARCHAR,property="etel",javaType=String.class),
				@Result(column="estate",jdbcType=JdbcType.INTEGER,property="estate",javaType=Integer.class),
				@Result(column="ebirthday",jdbcType=JdbcType.DATE,property="ebirthday",javaType=java.sql.Date.class),
				@Result(column="e_aid",jdbcType=JdbcType.BIGINT,property="eAid",javaType=Long.class)
		})
		public List<Emp> findEmpByID(Emp emp);
		
		//分页查看地区主管的信息
		@Select("select eid,ename,etel,estate,ebirthday,e_aid from emp")
		@Results(id="empToAreaResultMap",value= {
				@Result(id=true,column="eid",jdbcType=JdbcType.BIGINT,property="eid",javaType=Long.class),
				@Result(column="ename",jdbcType=JdbcType.VARCHAR,property="ename",javaType=String.class),
				@Result(column="etel",jdbcType=JdbcType.VARCHAR,property="etel",javaType=String.class),
				@Result(column="estate",jdbcType=JdbcType.INTEGER,property="estate",javaType=Integer.class),
				@Result(column="ebirthday",jdbcType=JdbcType.DATE,property="ebirthday",javaType=java.sql.Date.class),
				@Result(column="e_aid",jdbcType=JdbcType.BIGINT,property="eAid",javaType=Long.class),
				@Result(column="e_aid",property="area",
						one=@One(select="com.crm.dao.AreaMapper.findAreaNameByID")
						)
		})
		public List<Emp> findAllEmp();
		
		//根据员工所属地区查看员工信息
		
		//查看离职员工
		
		//查看在职员工
}
