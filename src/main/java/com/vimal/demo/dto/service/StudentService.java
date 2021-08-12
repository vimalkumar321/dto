package com.vimal.demo.dto.service;

import com.vimal.demo.dto.model.Student;
import com.vimal.demo.dto.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Consumer;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student){

        return studentRepository.save(student);
    }
    public List<Student> getAllStudents(){
        List<Student> studentList = new ArrayList<>();
        studentRepository.findAll().forEach(student -> studentList.add(student));
        return studentList;
    }
    public List<Student> getAllStudent(){
        List<Student> studentList = new ArrayList<>();
        studentRepository.findAll().forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                studentList.add(student);
            }
        });
        return studentList;
    }
}
