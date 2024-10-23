package com.thiha.sso.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
public class DemoController {
    
    @GetMapping("/secured")
    ResponseEntity<String> getText(){
        return new ResponseEntity<>("Hello from spring", HttpStatus.OK);
    }
}