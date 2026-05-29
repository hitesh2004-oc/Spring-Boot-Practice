package com.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.bean.User;

@Controller
public class UserController {

    // Path Information : Get
    @GetMapping("/user/info")
    public String showPage(Model model) {

        Map<String, Object> map = new HashMap<>();

        map.put("userName", "Hitesh Malviya");
        map.put("courseName", "SpringBoot");

        model.addAttribute("key", map);

        return "userHome";
    }

    // Sending One User Object
    @GetMapping("/user/data")
    public String showData(Model model) {

        User user = new User(1, "Vinod", "Student");

        model.addAttribute("obj", user);

        return "UserData";
    }
}