package com.example.demo.service;

import com.example.demo.dto.AddStudentDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.dto.UpdateStudentDto;

import java.util.List;

public interface StudentService {

    String addStudent(AddStudentDto addStudentDto);
    List<StudentDto> getStudent();
    String updateStudent(UpdateStudentDto updateStudentDto);
    String deleteStudent(int id);

}
