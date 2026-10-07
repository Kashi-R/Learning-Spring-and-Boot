package com.example;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Laptop {


    @Id
    private int lid;
    private String brand;
    private String model;
    private int ram;


    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }



    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", model='" + model + '\'' +
                ", lid=" + lid +
                ", brand='" + brand + '\'' +
                '}';
    }
}
