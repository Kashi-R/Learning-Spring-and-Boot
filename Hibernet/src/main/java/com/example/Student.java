package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int rollNo;
    private String name;
    private int sAge;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getsAge() {
        return sAge;
    }
    public void setsAge(int sAge) {
        this.sAge = sAge;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "org.example.Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", sAge=" + sAge +
                '}';
    }
}
