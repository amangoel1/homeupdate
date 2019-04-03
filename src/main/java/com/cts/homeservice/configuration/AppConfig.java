package com.cts.homeservice.configuration;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cts.homeservice.bean.Admin;

import static org.hibernate.cfg.Environment.*;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value={@ComponentScan("com.cts.homeservice.dao"),
@ComponentScan("com.cts.homeservice.service")
})
public class AppConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory()
	{
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		
		Properties properties = new Properties();
		properties.put(DRIVER, environment.getProperty("mysql.driver"));
		properties.put(URL, environment.getProperty("mysql.url"));
		properties.put(USER, environment.getProperty("mysql.user"));
		properties.put(PASS, environment.getProperty("mysql.password"));
		
		properties.put(C3P0_MIN_SIZE, environment.getProperty("hibernate.c3p0.min_size"));
		properties.put(C3P0_MAX_SIZE, environment.getProperty("hibernate.c3p0.max_size"));
		properties.put(C3P0_ACQUIRE_INCREMENT, environment.getProperty("hibernate.c3p0.acquire_increment"));
		properties.put(C3P0_TIMEOUT, environment.getProperty("hibernate.c3p0.timeout"));
		properties.put(C3P0_MAX_STATEMENTS, environment.getProperty("hibernate.c3p0.max_statements"));
		// hibernate settings
		properties.put(SHOW_SQL,environment.getProperty("hibernate.show_sql"));
		properties.put(HBM2DDL_AUTO,environment.getProperty("hibernate.hbm2ddl.auto"));
											
		sessionFactoryBean.setHibernateProperties(properties);
		//sessionFactoryBean.setAnnotatedClasses(Login.class);
		sessionFactoryBean.setPackagesToScan("com.cts.homeservice.bean");
		
		return sessionFactoryBean;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager()
	{
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
	
		return transactionManager;
	}
}
