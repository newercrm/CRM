package com.crm.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
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
	


	void   addclient(Client client);
	 
    void   updateclient(Client client);
    
    //查所有客户的信息
    @Select("SELECT * FROM CLIENT")
    @Results(id="ClientMapper",value= {
    		@Result(id=true,column = "CID",jdbcType = JdbcType.BIGINT,property = "cid",javaType = Long.class),
    		@Result(column = "CNAME",jdbcType = JdbcType.VARCHAR,property = "cname",javaType = String.class),
    		@Result(column = "C_EID",jdbcType = JdbcType.VARCHAR,property = "cEid",javaType = String.class),
    		@Result(column = "C_AID",jdbcType = JdbcType.BIGINT,property = "cAid",javaType = Long.class),
    		@Result(column = "CSTATE",jdbcType = JdbcType.INTEGER,property = "cstate",javaType =Integer.class),
    		@Result(column = "CTEL",jdbcType = JdbcType.VARCHAR,property = "ctel",javaType = String.class),
    		@Result(column = "CADDRESS",jdbcType = JdbcType.VARCHAR,property = "caddress",javaType = String.class),
    		@Result(column = "CQQ",jdbcType = JdbcType.VARCHAR,property = "cqq",javaType = String.class),
    		@Result(column = "CEMAIL",jdbcType = JdbcType.VARCHAR,property = "cemail",javaType = String.class),
    		
    		
    })
   
    List<Client> selectclient();
    @Select("SELECT cname,c_eid,caddress,cqq,cemail FROM client WHERE cid=#{cid}")
    @Results(id="selectbycid" ,value= {
			@Result(column="CNAME",jdbcType=JdbcType.VARCHAR,property="cname",javaType=String.class),
			@Result(column="C_EID",jdbcType=JdbcType.VARCHAR,property="cEid",javaType=String.class),
			@Result(column="CADDRESS",jdbcType=JdbcType.VARCHAR,property="caddress",javaType=String.class),
			@Result(column="CQQ",jdbcType=JdbcType.VARCHAR,property="cqq",javaType=String.class),
			@Result(column="CEMAIL",jdbcType=JdbcType.VARCHAR,property="cemail",javaType=String.class),
			@Result(column="E_AID",property="area",
			one=@One(select="com.crm.dao.AreaMapper.findAreaNameByID")
			)
    })
    //根据id查客户信息
   Client selectbycid(String cid);

   @Select("SELECT *from client WHERE cname LIKE concat(#{cname},'%')")
   @Results(id="selectBycname" ,value= {
			@Result(column="CNAME",jdbcType=JdbcType.VARCHAR,property="cname",javaType=String.class),
			@Result(column="C_EID",property="cEid",one=@One()),
			@Result(column="CADDRESS",jdbcType=JdbcType.VARCHAR,property="caddress",javaType=String.class),
			@Result(column="CQQ",jdbcType=JdbcType.VARCHAR,property="cqq",javaType=String.class),
			@Result(column="CEMAIL",jdbcType=JdbcType.VARCHAR,property="cemail",javaType=String.class),
			@Result(column="E_AID",property="area",
			one=@One(select="com.crm.dao.AreaMapper.findAreaNameByID")
			
			)
   })
   
   //模糊查询
     List<Client> selectBycname(String cname);
   
   
     void deleteclient(Client cid);
}
