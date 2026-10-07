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
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Laptop l2= new Laptop();
        l2.setLid(2);
        l2.setBrand("DELL");
        l2.setModel("XPS");
        l2.setRam(32);


        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Kashi");
        a1.setLaptops(Arrays.asList(l1,l2));
//        @Transient
//        sometime in production we want some data to in object, but not in DB
//        in that case we use @Trasient,so for that column will not be created
        a1.setTech("JAVA");

        l1.setAlien(a1);
        l2.setAlien(a1);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.example.Alien.class);
        cfg.addAnnotatedClass(com.example.Laptop.class);
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf= cfg.buildSessionFactory();
        Session session = sf.openSession();



        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(a1);

        transaction.commit();

        Alien a2 = session.find(Alien.class, 101);
        System.out.println(a2);
        session.close();
        sf.close();
    }
}
