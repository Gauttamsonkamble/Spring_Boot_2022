package com.developercorners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.developercorners.DemoAutowiredAnnotation.User;

@SpringBootApplication
public class SpringBoot2022Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2022Application.class, args);
		
		System.out.println("Hello World");
		
		
	}

}
