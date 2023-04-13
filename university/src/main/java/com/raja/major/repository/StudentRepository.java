package com.raja.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raja.major.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByName(String name);

}
