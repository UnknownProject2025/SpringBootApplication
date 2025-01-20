package com.example.demo.controller;

import com.example.demo.dto.AddStudentDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.dto.UpdateStudentDto;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/addStudent")
    public String addStudent(@RequestBody AddStudentDto addStudentDto) {
        String addStudent = studentService.addStudent(addStudentDto);
        return addStudent;
    }

    @GetMapping(path = "/getStudent")
    public List<StudentDto> getStudent() {
        List<StudentDto>getStudent = studentService.getStudent();
        return getStudent;
    }

    @PostMapping(path = "/updateStudent")
    public String updateStudent(@RequestBody UpdateStudentDto updateStudentDto) {
        String updateStudent = studentService.updateStudent(updateStudentDto);
        return updateStudent;
    }

    @DeleteMapping(path = "/deleteStudent/{id}")
    public String deleteStudent(@PathVariable(value = "id") int id) {
        String deleteStudent = studentService.deleteStudent(id);
        return deleteStudent;
    }

}
