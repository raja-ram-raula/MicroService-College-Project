package com.raja.major.service;

import com.raja.major.model.Student;

public interface StudentService {

	Student getById(int id);
	Student getByName(String name);
	boolean save(Student student);
	
}
