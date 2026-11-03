package com.example.telusko.app;

import com.example.telusko.app.model.Alien;
import com.example.telusko.app.model.Laptop;
import com.example.telusko.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringGettingStarted {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringGettingStarted.class, args);
//		Alien alien = context.getBean(Alien.class) ;
//		System.out.println(alien.getAge());
//		alien.code();
		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap=context.getBean(Laptop.class);
		service.addLaptop(lap);


	}

}
