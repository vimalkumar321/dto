package com.vimal.demo.dto.converter;

import com.vimal.demo.dto.dto.StudentDto;
import com.vimal.demo.dto.model.Student;
import org.modelmapper.ModelMapper;

public class StudentModelMapper {
    private ModelMapper modelMapper =new ModelMapper();

    public StudentDto entityToDto(){
        Student student = new Student();
        StudentDto dto = modelMapper.map(student,StudentDto.class);
        return dto;
    }

    public Student dtoToEntity(){
        StudentDto dto = new StudentDto();
        Student student = modelMapper.map(dto,Student.class);
        return student;
    }
}
