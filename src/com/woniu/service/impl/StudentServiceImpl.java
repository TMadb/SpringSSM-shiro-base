package com.woniu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.eneity.Student;
import com.woniu.mapper.StudentMapper;
import com.woniu.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public void insertStudent(Student student) {	
		studentMapper.insertStudent(student);
	}

}
