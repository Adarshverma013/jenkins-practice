package com.example.mydemoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public ResponseEntity<?> getStatus(){
        return ResponseEntity.ok("Hello From helloController Listing on Port: "+environment.getProperty("local.server.port"));
    }
}
