package com.crm.dao.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.crm.pojo.Log;



public class TestMain {
	private static Logger log = LogManager.getLogger();
	public static void main(String[] args) {
		LogMapperImpl logImpl = new LogMapperImpl();
		List<Log> list = logImpl.findAllLog();
		list.forEach((m)->log.debug(m));
	}
}
