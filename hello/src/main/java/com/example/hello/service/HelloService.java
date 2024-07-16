package com.example.hello.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello() {
        return "Welcome!";
    }
}
