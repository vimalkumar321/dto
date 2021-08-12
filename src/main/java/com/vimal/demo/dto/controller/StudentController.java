package com.vimal.demo.dto.controller;

import com.vimal.demo.dto.converter.StudentConverter;
import com.vimal.demo.dto.converter.StudentModelMapper;
import com.vimal.demo.dto.dto.StudentDto;
import com.vimal.demo.dto.model.Student;
import com.vimal.demo.dto.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentConverter studentConverter;

    @PostMapping("/create")
    public Student save(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    @GetMapping("/dto")
    public List<StudentDto> getAllStudents(){
        List<Student> list = studentService.getAllStudents();
        return studentConverter.entityToDto(list);
    }

    @GetMapping("/get")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

}
