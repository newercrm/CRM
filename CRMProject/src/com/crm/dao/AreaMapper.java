package com.crm.dao;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.crm.pojo.Area;
import com.crm.pojo.Emp;

public interface AreaMapper {
	//根据ID查找地区名
	@Select("select * from area where aid=#{eAid,jdbcType=BIGINT}")
	@Results(id="areaNameResultMap",value= {
			@Result(id=true,column="aid",jdbcType=JdbcType.BIGINT,property="aid",javaType=Long.class),
			@Result(column="areaname",jdbcType=JdbcType.VARCHAR,property="areaname",javaType=String.class),
			@Result(column="parentid",jdbcType=JdbcType.BIGINT,property="parentid",javaType=Long.class),
			@Result(column="parentid",property="area",
					one=@One(select="com.crm.dao.AreaMapper.findAreaNameByParentId"))
	})
	public Area findAreaNameByID(Emp emp);
	
	//根据父ID查找省份姓名
	@Select("select * from area where aid=#{parentid,jdbcType=BIGINT}")
	@Results(id="areaNameResultMapByParentId",value= {
			@Result(id=true,column="aid",jdbcType=JdbcType.BIGINT,property="aid",javaType=Long.class),
			@Result(column="areaname",jdbcType=JdbcType.VARCHAR,property="areaname",javaType=String.class),
			@Result(column="parentid",jdbcType=JdbcType.BIGINT,property="parentid",javaType=Long.class)
	})
	public Area findAreaNameByParentId(Area area);
}
