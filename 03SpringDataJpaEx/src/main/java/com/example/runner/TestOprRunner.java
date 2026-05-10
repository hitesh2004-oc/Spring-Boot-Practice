package com.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.Student;
import com.example.repo.StudentRepository;

@Component
public class TestOprRunner implements CommandLineRunner {

    @Autowired
    private StudentRepository repo;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(repo.getClass().getName());

        Student sob = new Student();

        sob.setStdId(1);
        sob.setStdName("Vinod");
        sob.setStdFee(25000.00);

        repo.save(sob);
    }
}