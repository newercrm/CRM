package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.crm.pojo.Emp;
import com.crm.service.EmpService;

@Controller
public class TestController {
	@Autowired
	private EmpService empService;
	
	@RequestMapping(path="/test")
	public ModelAndView testFindAllEmp() {
		List<Emp> emp=empService.findAllEmp();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("emp",emp);
		modelAndView.setViewName("testData.jsp");
		return modelAndView;
	}
	
	@RequestMapping(path="/testaid/{abc}")
	public ModelAndView testFindEmpByAid(@PathVariable("abc")String aid) {
		List<Emp> emp1=empService.findEmpByAid(aid);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("empbyaid",emp1);
		modelAndView.setViewName("/testData.jsp");
		return modelAndView;
		
	}
	
	@RequestMapping(path="/testeid/{abc}")
	public ModelAndView testFindEmpByEid(@PathVariable("abc")String eid) {
		List<Emp> emp=empService.findEmpByEid(eid);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("empbyeid",emp);
		modelAndView.setViewName("/testData.jsp");
		return modelAndView;
	}
	
	@RequestMapping(path="/testetel/{abc}")
	public ModelAndView testFindEmpByEtel(@PathVariable("abc")String etel) {
		List<Emp> emp=empService.findEmpByEtel(etel);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("empbyetel",emp);
		modelAndView.setViewName("/testData.jsp");
		return modelAndView;
	}
	
	@RequestMapping(path="/testename/{abc}")
	public ModelAndView testFindEmpByEname(@PathVariable("abc")String ename) {
		List<Emp> emp=empService.findEmpByEname(ename);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("empbyename",emp);
		modelAndView.setViewName("/testData.jsp");
		return modelAndView;
	}
	
	@RequestMapping(path="/testquitemp")
	public ModelAndView testFindQuitEmp() {
		List<Emp> emp=empService.findQuitEmp();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("quitemp",emp);
		modelAndView.setViewName("/testData.jsp");
		return modelAndView;
	}
	
}
