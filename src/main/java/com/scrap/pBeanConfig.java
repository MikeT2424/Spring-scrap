package com.scrap;

import org.springframework.beans.factory.annotation.Autowired;

//I also have config in this jar

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class pBeanConfig {

	//Autowire in the bean for the whole class.
//	@Autowired
//	ExBean exBean;
//	
//	public pBeanConfig() {
//	
//	//Or, you may want to have a bean instance whenever the pBeanConfig class is instantiated.
//	ExBean exBean;
//   }
	
	@Bean
    public ExBean getExpBean() {
        return new ExBean();
    }
}
