package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.entity.User;
import com.app.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return repo.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return repo.findAll();
    }

}