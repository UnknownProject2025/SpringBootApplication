package com.example.demo.service;

import com.example.demo.dto.AddStudentDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.dto.UpdateStudentDto;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String addStudent(AddStudentDto addStudentDto) {

        StudentEntity studentEntity = new StudentEntity(
                addStudentDto.getName(),
                addStudentDto.getContact(),
                addStudentDto.getAddress()
        );
        studentRepo.save(studentEntity);
        return "Successfully Created Student Record!";

    }

    @Override
    public List<StudentDto> getStudent() {

        List<StudentEntity> getStudent = studentRepo.findAll();
        List<StudentDto> studentDtoList = new ArrayList<>();
        for(StudentEntity studentEntity : getStudent) {
            StudentDto studentDto = new StudentDto(
                    studentEntity.getId(),
                    studentEntity.getName(),
                    studentEntity.getContact(),
                    studentEntity.getAddress()
            );
            studentDtoList.add(studentDto);
        }
        return studentDtoList;

    }

    @Override
    public String updateStudent(UpdateStudentDto updateStudentDto) {

        if(studentRepo.existsById(updateStudentDto.getId())) {
            StudentEntity studentEntity = studentRepo.getById(updateStudentDto.getId());
            studentEntity.setName(updateStudentDto.getName());
            studentEntity.setContact(updateStudentDto.getContact());
            studentEntity.setAddress(updateStudentDto.getAddress());
            studentRepo.save(studentEntity);
            return "Successfully Updated Student Record!";
        }else {
            System.out.println("Student Not Available!");
            return "Invalid Student Record!";
        }

    }

    @Override
    public String deleteStudent(int id) {

        if(studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
            return "Successfully Deleted Student Record!";
        }else {
            System.out.println("Student Not Available!");
            return "Invalid Student Record!";
        }

    }

}
