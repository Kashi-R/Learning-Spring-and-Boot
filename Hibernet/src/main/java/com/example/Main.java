package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.beans.Transient;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.example.Laptop.class);
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf= cfg.buildSessionFactory();
        Session session = sf.openSession();

//        select*from laptop where ram=32------------>SQL
//        from Laptop where ram=32

        Query query = session.createQuery("from Laptop where ram=32",Laptop.class);
        List<Laptop> laptops= query.getResultList();
//        Laptop l1= session.find(Laptop.class, 1);
        System.out.println(laptops);
         session.close();

        sf.close();
    }
}
