package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Karan");
        s1.setRollNo(6);
        s1.setsAge(22);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.example.Student.class);
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf= cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.persist(s1);

        tx.commit();

        System.out.println(s1);
    }
}
