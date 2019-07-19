package com.crm.factory;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * spring bean工厂类
 * @author Administrator
 *
 */
@Configuration
@ComponentScan("com.crm.factory")
@EnableTransactionManagement(proxyTargetClass=true)
public class SpringFactory {
	
	//c3p0数据源配置
	@Bean
	public ComboPooledDataSource c3p0DataSource() {
		return new ComboPooledDataSource();
	}
	
	//加载Mybatis核心配置文件
	@Bean
	@Autowired
	public SqlSessionFactory sqlSessionFactory(DataSource c3p0DataSource) {
		SqlSessionFactoryBean factoryBean
			= new SqlSessionFactoryBean();
		factoryBean.setDataSource(c3p0DataSource);
		
		//通过ClassPathResource类来加载MyBatis核心配置文件
		Resource resource = new ClassPathResource("mybatis-config.xml");
		
		//Resource接口对象传递个对性的set方法
		factoryBean.setConfigLocation(resource);
		
		SqlSessionFactory sqlSessionFactory = null;
		try {
			sqlSessionFactory = factoryBean.getObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sqlSessionFactory;
	}
	
	//创建MyBatis Template 工厂Bean
	@Bean
	@Autowired
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory factoryConfigurated) {
			
		SqlSessionTemplate template = null;
		try {
			//从SqlSessionFactoryBean 获取SqlSessionFactory接口实现类的实例
			//然后注入到SqlSessionTemplate 构造函数中
			template = new SqlSessionTemplate(factoryConfigurated);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return template;
	}	
	
	//创建事务管理器
	@Bean
	@Autowired
	public DataSourceTransactionManager transactionManager(DataSource c3p0DataSource) {
		return new DataSourceTransactionManager(c3p0DataSource);
		
	}
}
