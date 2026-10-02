package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.beans.Transient;


public class Main {
    public static void main(String[] args) {

        Laptop lap= new Laptop();
        lap.setBrand("Asus");
        lap.setModel("Rog");
        lap.setRam(16);


        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Kashi");
        a1.setLaptop(lap);


//        @Transient
//        sometime in production we want some data to in object, but not in DB
//        in that case we use @Trasient,so for that column will not be created
        a1.setTech("JAVA");

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.example.Alien.class);
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf= cfg.buildSessionFactory();
        Session session = sf.openSession();



        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();

        Alien a2 = session.find(Alien.class, 101);
        System.out.println(a2);
        session.close();
        sf.close();
    }
}
