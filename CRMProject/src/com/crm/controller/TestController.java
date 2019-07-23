package com.crm.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.crm.dao.AreaMapper;
import com.crm.pojo.Area;
import com.crm.pojo.Emp;
import com.crm.service.EmpService;

@Controller
public class TestController {
	@Autowired
	private EmpService empService;
	
	@RequestMapping(path="/test")
	public ModelAndView testFindAreaNameByID() {
		List<Emp> emp=empService.findAllEmp();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("emp",emp);
		modelAndView.setViewName("testData.jsp");
		return modelAndView;
	}
}
