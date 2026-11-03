package com.example.telusko.app.service;

import com.example.telusko.app.repo.LaptopRepository;
import com.example.telusko.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }
    public boolean isGoodLaptop(Laptop lap) {
        return true;
    }
}
