package com.apolis.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.apolis.entity.User;

@SpringBootApplication
@ComponentScan("com.apolis")
public class SpringbootProfilesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootProfilesApplication.class, args);
		User user = (User)context.getBean("dbData");
		System.out.println(user);
	}

}
