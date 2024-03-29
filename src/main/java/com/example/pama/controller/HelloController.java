package com.example.pama.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String home(Model model) {
        return "home";
    }
    @GetMapping("/login")
    public String login(Model model) {
        return "loginForm";
    }
}
