package com.capgemini.retailermaintainencesystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class ORMConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean createEntityManager() {
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("retailer");
		return bean;
	}

}
