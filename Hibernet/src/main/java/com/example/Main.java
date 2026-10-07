package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.beans.Transient;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Laptop l1= new Laptop();
        l1.setLid(4);
        l1.setBrand("Lenovo");
        l1.setModel("Legeion");
        l1.setRam(32);


        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.example.Laptop.class);
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf= cfg.buildSessionFactory();
        Session session = sf.openSession();



        Transaction transaction = session.beginTransaction();

        session.persist(l1);


        transaction.commit();


        session.close();


        sf.close();
    }
}
