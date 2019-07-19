package com.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.type.JdbcType;

import com.crm.pojo.Role;

public interface RoleMapper {
	
	@Select("SELECT RID,ROLENAME FROM ROLE")
    @Results(id="roleResultMap",value = {
            @Result(id=true,column = "RID",jdbcType = JdbcType.BIGINT,property = "rid",javaType = Long.class),
            @Result(column = "ROLENAME",jdbcType = JdbcType.VARCHAR,property = "rolename",javaType = String.class),
    })
	public List<Role> findAllRole();
}