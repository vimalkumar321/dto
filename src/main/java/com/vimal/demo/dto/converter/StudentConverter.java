package com.vimal.demo.dto.converter;

import com.vimal.demo.dto.dto.StudentDto;
import com.vimal.demo.dto.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentConverter {

    public StudentDto entityToDto(Student student){
        StudentDto dto = new StudentDto();
        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setDob(student.getDob());
        dto.setMobile(student.getMobile());
        dto.setEmail(student.getEmail());
        return dto;
    }

    public List<StudentDto> entityToDto(List<Student> students){
        return students.stream().map(x->entityToDto(x)).collect(Collectors.toList());
    }

    public Student dtoToEntity(StudentDto dto){
        Student student = new Student();
        student.setId(dto.getId());
        student.setName(dto.getName());
        student.setDob(dto.getDob());
        student.setMobile(dto.getMobile());
        student.setEmail(dto.getEmail());
        student.setPassword(student.getPassword());
        return student;
    }

    public List<Student> dtoToEntity(List<StudentDto> dto){
        return dto.stream().map(x->dtoToEntity(x)).collect(Collectors.toList());
    }
}
