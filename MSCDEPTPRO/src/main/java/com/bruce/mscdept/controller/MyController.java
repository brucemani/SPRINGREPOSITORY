package com.bruce.mscdept.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MyController {


    @GetMapping(path = "/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok().body("Hello, Maheshwari");
    }
}
