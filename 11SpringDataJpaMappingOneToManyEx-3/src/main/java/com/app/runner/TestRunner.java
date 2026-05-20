package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Branch;
import com.app.entity.College;
import com.app.repo.CollegeRepository;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private CollegeRepository collegeRepo;

    @Override
    public void run(String... args) throws Exception {

    	Branch b1 = new Branch(101, "Computer Science", "Dr. Sharma");
    	Branch b2 = new Branch(102, "Mechanical Engineering", "Dr. Verma");
    	Branch b3 = new Branch(103, "Civil Engineering", "Dr. Singh");
    	Branch b4 = new Branch(104, "Electrical Engineering", "Dr. Mehta");
    	Branch b5 = new Branch(105, "Information Technology", "Dr. Patel");

        College c1 = new College(1,"ABC Engineering College","Jaipur",Arrays.asList(b1, b2, b3, b4, b5));

        collegeRepo.save(c1);

    }
}