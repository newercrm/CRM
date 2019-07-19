package com.crm.controller;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

@Configuration
public class JsonDataHandler {
	
	/*
	 * 创建MappingJackson2HttpMessageConverter 主要功能解析JSON数据
	 * application/x-www-form-urlencoded;charset=UTF-8
	 * APPLICATION_FORM_URLENCODED_VALUE
	 */
	@Bean
	public MappingJackson2HttpMessageConverter jackson2HttpMessageConverter() {
		
		MappingJackson2HttpMessageConverter httpMessageConverter
			= new MappingJackson2HttpMessageConverter();
		
		List<MediaType> list = new ArrayList<MediaType>();
		
		list.add(MediaType.APPLICATION_JSON_UTF8);
		list.add(new MediaType("text", "html", StandardCharsets.UTF_8));
		list.add(new MediaType("application", "x-www-form-urlencoded", StandardCharsets.UTF_8));
		
		httpMessageConverter.setSupportedMediaTypes(list);
		
		return httpMessageConverter;
	}
	
	/*
	 * 创建RequestMappingHandlerAdapter 
	 * 取代spring 3.0版以前的org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter
	 */
	@Bean
	@Autowired
	public RequestMappingHandlerAdapter requestMappingHandlerAdapte(MappingJackson2HttpMessageConverter jackson2HttpMessageConverter) {
		RequestMappingHandlerAdapter requestMappingHandlerAdapte
			= new RequestMappingHandlerAdapter();
		List<HttpMessageConverter<?>> list = new ArrayList<HttpMessageConverter<?>>();
		list.add(jackson2HttpMessageConverter);
		requestMappingHandlerAdapte.setMessageConverters(list);
		
		return requestMappingHandlerAdapte;
	}
	
	
}
