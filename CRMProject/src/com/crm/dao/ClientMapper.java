package com.crm.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.crm.pojo.Client;

public interface ClientMapper {
	@Select("select cname,ctel from client where cid = #{cid,jdbcType=BIGINT}")
	@Results(id = "findNameTel",value= {
			@Result(column="CNAME",jdbcType=JdbcType.VARCHAR,property="cname",javaType=String.class),
			@Result(column="CTEL",jdbcType=JdbcType.VARCHAR,property="ctel",javaType=String.class)	
	})
	List<Client> findNameTel(Long cid);
}
