package com.training.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AccessController {
    @GetMapping
    public String homePage(){
        return "WELCOME TO THE SPRING BOOT SECURITY MODULE.";
    }

    @GetMapping("paid")
    public String paidContent(){
        return "This is for the Subscriber";
    }
}