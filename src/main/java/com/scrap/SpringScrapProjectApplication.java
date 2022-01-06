package com.scrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringScrapProjectApplication {
	
	//Added a logger to display the components on start:
	static Logger LOG = LoggerFactory.getLogger(SpringScrapProjectApplication.class);

	public static void main(String[] args) {
		ApplicationContext apc = SpringApplication.run(SpringScrapProjectApplication.class, args);
		
		//Display all the beans in this loop:
		for(String s : apc.getBeanDefinitionNames()) {
			LOG.info("Spring Bean: " + s);
		}
		LOG.info("/////////////////////////////////////////////////////////////////");
		for(String s : apc.getBeanDefinitionNames()) {
			System.out.println("Spring Bean: " + s);
		}

	}

}
