package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        //create new student
        Student s1 = new Student();
        s1.setName("Manika");
        s1.setRollNo(2);
        s1.setsAge(15);

        //fetch date
        Student s2 = null;

        //update
        Student s3 = new Student();
        s3.setName("Ananta");
        s3.setRollNo(10);
        s3.setsAge(21);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.example.Student.class);
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf= cfg.buildSessionFactory();
        Session session = sf.openSession();

        s2 = session.find(Student.class,2);



        Transaction transaction = session.beginTransaction();

        //session.persist(s1);
        session.merge(s3);

        transaction.commit();
        session.close();
        sf.close();

        System.out.println(s2.getName());
    }
}
