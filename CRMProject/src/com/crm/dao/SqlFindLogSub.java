package com.crm.dao;

import java.util.Map;

import com.crm.pojo.Log;

public class SqlFindLogSub {

	public String findLogClass(Log log) {
		StringBuffer sql = new StringBuffer();
		sql.append("select lid,logmessage,logtime,starttime,endtime,lstate,l_eid,l_cid from log where");
		// 客户id是否为空
		if (log.getlCid() != null) {
			sql.append(" l_cid = #{lCid,jdbcType=BIGINT} or");
		}
		// 员工id是否为空
		if (log.getlEid() != null) {
			sql.append(" l_eid = #{lEid,jdbcType=BIGINT} or");
		}
		// 概要是否为空
		if (log.getLogmessage() != null) {
			sql.append(" logmessage = #{logmessage,jdbcType=VARCHAR} or");
		}
		// 状态是否为空
		if (log.getLstate() != null) {
			sql.append(" lstate = #{lstate,jdbcType=INTEGER} or");
		}
		//如果都没有的情况
		if (log.getlCid() == null & log.getlEid() == null & log.getLogmessage() == null & log.getLstate() == null) {
			sql.append(" 1=1 or");
		}

		// 删除最后一个地址
		sql.deleteCharAt(sql.lastIndexOf("o"));
		sql.deleteCharAt(sql.lastIndexOf("r"));

		/* sql.append(" WHERE u_id=#{uId,jdbcType=BIGINT}"); */

		return sql.toString();
	}
	
	public String findLoglCidByName(Map<String,String> map) {
		StringBuffer sql = new StringBuffer();
		sql.append("select cid from client where ");
		if(map.get("cname") != null) {
			sql.append("cname = #{cname,jdbcType=VARCHAR} and ");
		}
		if(map.get("ctel") != null) {
			sql.append("ctel = #{ctel,jdbcType=VARCHAR} and ");
		}
		if(map.get("cname") == null & map.get("ctel") == null) {
			sql.append("1 = 1 and");
		}
		sql.deleteCharAt(sql.lastIndexOf("a"));
		sql.deleteCharAt(sql.lastIndexOf("n"));
		sql.deleteCharAt(sql.lastIndexOf("d"));
		
		return sql.toString();
	}
	
	public String findLoglEidByName(Map<String,String> map) {
		StringBuffer sql = new StringBuffer();
		sql.append("select eid from emp where ");
		if(map.get("ename") != null) {
			sql.append("ename = #{ename,jdbcType=VARCHAR} and ");
		}
		if(map.get("etel") != null) {
			sql.append("etel = #{etel,jdbcType=VARCHAR} and ");
		}
		if(map.get("ename") == null & map.get("etel") == null) {
			sql.append("1 = 1 and");
		}
		sql.deleteCharAt(sql.lastIndexOf("a"));
		sql.deleteCharAt(sql.lastIndexOf("n"));
		sql.deleteCharAt(sql.lastIndexOf("d"));
		return sql.toString();
		
	}
	
	public String updateLogMessage(Log log) {
		StringBuffer sql = new StringBuffer();
		sql.append("update log set");
		if(log.getLogmessage()!=null) {
			sql.append(" logmessage = #{logmessage,jdbcType=VARCHAR},");
		}
		if(log.getStarttime() != null) {
			sql.append(" starttime = #{starttime,jdbcType=TIMESTAMP},");
		}
		if(log.getEndtime() != null) {
			sql.append(" endtime = #{endtime,jdbcType=TIMESTAMP},");
		}
		if(log.getlCid() != null) {
			sql.append(" l_cid = #{lCid,jdbcType=BIGINT},");
		}
		if(log.getlEid() != null) {
			sql.append(" l_eid = #{lEid,jdbcType=BIGINT},");
		}
		if(log.getLstate() != null) {
			sql.append(" lstate = #{lstate,jdbcType=INTEGER},");
		}
		if(log.getLogmessage()==null&log.getStarttime() == null
				&log.getEndtime() == null&log.getlCid() == null&log.getlEid() == null
				&log.getLstate() == null) {
			sql.append(" 1 = 1 ");
		}

		sql.deleteCharAt(sql.lastIndexOf(","));
		sql.append(" where lid = #{lid,jdbcType=BIGINT}");
		return sql.toString();
		
	}
}
