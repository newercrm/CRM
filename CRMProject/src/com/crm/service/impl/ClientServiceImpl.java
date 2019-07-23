package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.ClientMapper;
import com.crm.pojo.Client;
import com.crm.service.ClientService;

@Service

public class ClientServiceImpl implements ClientService{
	@Resource
	private ClientMapper clientMapper;

	@Override
	public List<Client> selectclient() {
		
		return clientMapper.selectclient();
	}

}
