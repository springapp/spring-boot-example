package com.example;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootExampleApplication.class, args);
		
		String[] beanNames = context.getBeanDefinitionNames();
		
		Arrays.sort(beanNames);
		
		for(String beanName : beanNames){
			System.out.println(beanName);	
		}
	}
}
