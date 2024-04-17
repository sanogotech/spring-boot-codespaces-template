package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "greeting";
    }
}
