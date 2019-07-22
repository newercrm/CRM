package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.crm.dao.LogMapper;
import com.crm.pojo.Log;

@Controller
@SessionAttributes(names= {"logMess"})
public class LogController {
	@Autowired
	private LogMapper logMapper;

	@RequestMapping(path="/fingLog")
	public ModelAndView fingLog() {
		ModelAndView modelAndView = new ModelAndView();
		List<Log> list = logMapper.findAllLog();
		modelAndView.addObject("logMess", list);
		modelAndView.setViewName("redirect:/log_jsp/superLog.jsp");
		return modelAndView;
	}
}
