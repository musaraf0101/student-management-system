package com.example.demo.controller;

import com.example.demo.service.TestService;
import com.example.demo.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class TestController {
    @Autowired
    private TestService t1;

    @GetMapping(path = "/1")
    public ResponseEntity<StandardResponse> message(){
        String data = t1.getMessage();
        return new ResponseEntity<>(new StandardResponse("Success",200,data), HttpStatus.OK);
    }
}
