package com.kashi.Module1.Introduction;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @PostConstruct
    public void beforePayment(){
        System.out.println("Initiating Payment");
    }

    public void pay(){
        System.out.println("Paying... ");
    }

    @PreDestroy
    public void afterPayment(){
        System.out.println("Payment Complete  ");
    }
}
