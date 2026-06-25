package com.app.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.model.AuthRequest;
import com.app.util.JwtUtil;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(
            @RequestBody AuthRequest request) {

        // Hardcoded validation
        if ("Hitesh Malviya".equals(request.getUsername())
                && "Hitesh123".equals(request.getPassword())) {

            return jwtUtil.generateToken(
                    request.getUsername());
        }

        return "Invalid Username or Password";
    }
}