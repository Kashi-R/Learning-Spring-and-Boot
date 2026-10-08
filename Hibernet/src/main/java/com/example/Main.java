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
//Level 1 caching , do it will fire the query only one time as they have same operation.
        Laptop laptop_1 = session.find(Laptop.class,3);
        System.out.println(laptop_1);

        Laptop laptop_2 = session.find(Laptop.class,3);
        System.out.println(laptop_2);

         session.close();

         Session session_1 = sf.openSession();
//         for another session it will fire another query for the same, l1 cache not work.

        Laptop laptop_3 = session_1.find(Laptop.class,3);
        System.out.println(laptop_3);
//        now we can have l2 cache , by adding some external lib
//        (ehcache(excluding jaxb runtime) and jcache )
//        And also we have to mention @Cacheable in Laptop class
//        now we can see only query is firing ine time for both different session for same operation

         session_1.close();
        sf.close();
    }
}
