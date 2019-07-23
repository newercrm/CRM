package com.crm.service;

import java.util.List;

import com.crm.pojo.Client;

public interface ClientService {
	//查所有客户
	List<Client> selectclient();
	//根据id查客户
	Client selectbycid(String cid);
}
