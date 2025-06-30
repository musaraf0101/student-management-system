package com.example.demo.service;

import com.example.demo.DTO.RequestDTO.StudentRequestDTO;
import com.example.demo.DTO.ResponseDTO.StudentResponseDTO;

import java.util.List;

public interface StudentService {
    public StudentResponseDTO getStudent(StudentRequestDTO dto);//post

    List<StudentResponseDTO> getStudentDetails();
}
