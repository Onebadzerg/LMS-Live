package com.example.lms_backend.controller;

import com.example.lms_backend.model.Member;
import com.example.lms_backend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> payload) {
        String username = payload.get("username");
        String password = payload.get("password");

        Member user = authService.login(username, password);

        Map<String, Object> response = new HashMap<>();
        if (user != null) {
            response.put("success", true);
            response.put("username", user.getMemberName());
            response.put("isAdmin", "yes".equalsIgnoreCase(user.getIsAdmin()));
        } else {
            response.put("success", false);
        }
        return response;
    }

    @PostMapping("/register")
    public Map<String, Object> register(@RequestBody Member member) {
        Member saved = authService.register(member);
        Map<String, Object> response = new HashMap<>();
        if (saved != null) {
            response.put("success", true);
            response.put("message", "User registered successfully");
        } else {
            response.put("success", false);
            response.put("message", "User already exists");
        }
        return response;
    }
}
