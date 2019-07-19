package com.crm.factory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


/**
 * 调用sevice注解方式的bean
 * @author Administrator
 *
 */
@Component
@ComponentScan("com.crm")
public class SpringBeanFactory {
	private static AnnotationConfigApplicationContext context=null;
	
	 //加载核心配置文件
	public static AnnotationConfigApplicationContext  getAnnotationCpntext() {
		context= new AnnotationConfigApplicationContext(SpringBeanFactory.class);
		return context;
	} 
        
    
}
