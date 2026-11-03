package com.example.telusko.app.repo;

import com.example.telusko.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
//        write jdbc steps here to to operation with jdbc
        System.out.println("Save in Database..");
    }
}
