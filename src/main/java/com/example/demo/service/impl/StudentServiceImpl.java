package com.example.demo.service.impl;

import com.example.demo.DTO.RequestDTO.StudentRequestDTO;
import com.example.demo.DTO.ResponseDTO.StudentResponseDTO;
import com.example.demo.Repo.StudentRepo;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo student;

    public StudentResponseDTO getStudent(StudentRequestDTO dto){
        return new StudentResponseDTO(
                dto.getName(),
                dto.getAge(),
                dto.getNic()
        );
    }
    List<StudentResponseDTO> getStudentDetails(){

    }
}
