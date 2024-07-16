package com.example.hello.controller;

import com.example.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/greet")
    public ResponseEntity<String> greet() {
        String response = helloService.hello();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
