package com.kashi.Module1.Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.beans.JavaBean;

@Configuration
public class AppCofig {

    @Bean
//    @Scope("prototype")
    PaymentService paymentService(){
        return new PaymentService();
    }
}
