package com.crm.Test;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.crm.pojo.Role;
import com.crm.service.RoleService;

@Component
@ComponentScan("com.crm")
public class TestMain {
	private static Logger log= LogManager.getLogger();
    private static AnnotationConfigApplicationContext context=null;
    
    //加载核心配置文件
    static{
        context= new AnnotationConfigApplicationContext(TestMain.class);
    }
	
	public static void main(String[] args) {
		RoleService service=context.getBean("roleServiceImpl",RoleService.class );
		List<Role> list=service.selectAllTeacher();
		list.forEach((m)->log.debug(m));
	}
}
