package com.telusko.SpringJDBC.service;

import com.telusko.SpringJDBC.model.Student;
import com.telusko.SpringJDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        repo.save(s);
//        System.out.println("Student added..");
    }

    public List<Student> getStudents() {
//        System.out.println("These are the students found in the database🔥⤵️");
        return repo.findAll();
    }
}
