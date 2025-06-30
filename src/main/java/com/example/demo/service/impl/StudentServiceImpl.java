package com.example.demo.service.impl;

import com.example.demo.DTO.RequestDTO.StudentRequestDTO;
import com.example.demo.DTO.ResponseDTO.StudentResponseDTO;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    public StudentResponseDTO getStudentDetails(StudentRequestDTO dto){
        return new StudentResponseDTO(
                dto.getName(),
                dto.getAge(),
                dto.getNic()
        );
    }
}
