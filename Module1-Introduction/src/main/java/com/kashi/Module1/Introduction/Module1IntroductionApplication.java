package com.kashi.Module1.Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {
        @Autowired
		PaymentService paymentServiceObj  ;

//		@Autowired
//		PaymentService paymentServiceObj2;


	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		paymentServiceObj.pay();
//		paymentServiceObj2.pay();
//		System.out.println(paymentServiceObj.hashCode());
//		System.out.println(paymentServiceObj2.hashCode());
//		for checking different bean by @scope prototype

	}
}
