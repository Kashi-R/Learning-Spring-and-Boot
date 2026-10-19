package com.example.telusko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringGettingStarted {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringGettingStarted.class, args);
		Alien alien = context.getBean(Alien.class) ;
		alien.code();
//		Laptop laptop=context.getBean(Laptop.class);
//		laptop.compile();

	}

}
