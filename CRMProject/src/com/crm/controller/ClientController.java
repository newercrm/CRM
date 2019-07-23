package com.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.crm.pojo.Client;
import com.crm.pojo.Role;
import com.crm.service.ClientService;

@Controller

public class ClientController {
    @Autowired
	private ClientService clientService;
	
	@RequestMapping(path="/list")
	@ResponseBody
	public ModelAndView list(){
		List<Client> list=clientService.selectclient();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("messs",list);
		modelAndView.setViewName("text1.jsp");
		return modelAndView;
		
	}
	@RequestMapping(path="/kehu/{aaa}")
	@ResponseBody
	
	public ModelAndView kehu(@PathVariable("aaa")String  cid){
		Client client=(Client) clientService.selectbycid(cid);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("messss",client);
		modelAndView.setViewName("/text2.jsp");
		return modelAndView;
		
	}
	 

}
