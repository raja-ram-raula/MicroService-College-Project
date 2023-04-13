package com.raja.major.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raja.major.model.Student;
import com.raja.major.repository.StudentRepository;
import com.raja.major.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentrepository ;
	
	@Override
	public Student getById(int id) {
		Student s = studentrepository.findById(id).orElse(null);
		return s;
	}
	
	@Override
	public Student getByName(String name) {
		Student s = studentrepository.findByName(name);
		return s;
	}

	@Override
	public boolean save(Student student) {
		studentrepository.save(student);
		return true;
	}

	
}
