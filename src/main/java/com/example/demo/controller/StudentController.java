package com.example.demo.controller;

import com.example.demo.DTO.RequestDTO.StudentRequestDTO;
import com.example.demo.DTO.ResponseDTO.StudentResponseDTO;
import com.example.demo.service.StudentService;
import com.example.demo.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class StudentController {

    @Autowired
    private StudentService t1;

    @PostMapping(path = "/new")
    public ResponseEntity<StandardResponse> userDetails(
            @RequestBody StudentRequestDTO dto
            ){
        return new ResponseEntity<>(new StandardResponse(
                "Data recive Success",
                200,
                t1.getStudent(dto)
        ), HttpStatus.OK);
    }
    @GetMapping(path = "/get-details")
    public ResponseEntity<StandardResponse> getStudentDetails(){
        return new ResponseEntity<>(new StandardResponse(
                "data retrive successfully",
                200,
                t1.getStudentDetails()
        ),HttpStatus.OK);
    }
}
