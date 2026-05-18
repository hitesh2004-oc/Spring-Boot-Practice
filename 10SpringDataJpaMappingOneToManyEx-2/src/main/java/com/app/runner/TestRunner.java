package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Order;
import com.app.entity.User;
import com.app.repo.OrderRepository;
import com.app.repo.UserRepository;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    private OrderRepository orderRepo;
    

    @Override
    public void run(String... args) throws Exception {

        Order o1 = new Order(101, "ORD-A1", 4500.0);
        Order o2 = new Order(102, "ORD-A2", 3200.0);
        Order o3 = new Order(103, "ORD-B1", 8700.0);
        Order o4 = new Order(104, "ORD-B2", 1500.0);
        Order o5 = new Order(105, "ORD-C1", 9200.0);

        User u1 = new User(1,"Hitesh","Hitesh@gmail.com",Arrays.asList(o1, o2));

        User u2 = new User(2,"Vinod","Vinod@gmail.com",Arrays.asList(o3, o4, o5));
        
        orderRepo.save(o1);
        orderRepo.save(o2);
        orderRepo.save(o3);
        orderRepo.save(o4);
        orderRepo.save(o5);
        
        userRepo.save(u1);
        userRepo.save(u2);

    }
}