package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Main {
    public static void main(String[] args) {


        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.example.Laptop.class);
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf= cfg.buildSessionFactory();
        Session session = sf.openSession();

        Laptop laptop = session.getReference(Laptop.class,3);
//        System.out.println(laptop);
//        getREference will not fire a query, until the required, so uncommentind the sout line will fire query.

         session.close();

        sf.close();
    }
}
