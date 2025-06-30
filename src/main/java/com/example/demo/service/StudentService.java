package com.example.demo.service;

import com.example.demo.DTO.RequestDTO.StudentRequestDTO;
import com.example.demo.DTO.ResponseDTO.StudentResponseDTO;

public interface StudentService {
    public StudentResponseDTO getStudentDetails(StudentRequestDTO dto);
}
