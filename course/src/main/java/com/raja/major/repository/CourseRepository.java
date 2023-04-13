package com.raja.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raja.major.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
