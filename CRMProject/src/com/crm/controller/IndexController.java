package com.crm.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.crm.factory.SpringBeanFactory;
import com.crm.pojo.Role;
import com.crm.service.RoleService;



/**
 * 通过springmvc注解方式来进行controller的配置 不需要 继承AbstractController  实现Controller
 * @author Administrator
 * 标注@Controller
 * 配置请求映射路径和方法,在对应的处理方法上标记@RequestMapping		
 */
@Controller
@SessionAttributes
public class IndexController {
		
	
	
	@RequestMapping(path="/index")
	public ModelAndView index() {
		AnnotationConfigApplicationContext context = SpringBeanFactory.getAnnotationCpntext();
		RoleService service=context.getBean("roleServiceImpl",RoleService.class );
		List<Role> list=service.selectAllTeacher();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("mess",list);
		modelAndView.setViewName("index.jsp");
		return modelAndView;
	}
}
