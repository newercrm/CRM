package com.crm.dao;

import com.crm.pojo.Role;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
	public List<Role> findAllRole();
}