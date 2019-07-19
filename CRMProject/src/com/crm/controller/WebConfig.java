package com.crm.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * web工程相关配置类
 */
@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer{
	/*
	 * 静态资源请求路径映射处理器
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//填写静态资源映射路径名称
		registry.addResourceHandler("/ziyuan/**")
		
		//填写静态资源的实际路径名称
		.addResourceLocations("/resources/");
		
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
	

	
}
