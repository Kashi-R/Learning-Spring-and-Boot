package com.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alien {

    @Id
    private int aid;
    private String aname;
    private String tech;
    @OneToMany(fetch = FetchType.EAGER)
    //By default it is lazy fetch , but when we write eager, then it fires all query, still if we dont ask for  it.
    private List<Laptop> laptops;

    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptop() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
