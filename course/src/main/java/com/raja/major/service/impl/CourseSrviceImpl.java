package com.raja.major.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raja.major.entity.Course;
import com.raja.major.repository.CourseRepository;
import com.raja.major.service.CourseService;

@Service
public class CourseSrviceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public boolean create(Course course) {
		//Insert into course (name,duration) values ('BTech',4)

		courseRepository.save(course);
		return true;
	}

	@Override
	public Course getById(int courseId) {
		//Select * from course Where id=1
		Course course =courseRepository.findById(courseId).orElse(null);
		return course;
	}

	@Override
	public List<Course> getAll() {
		//select * from course;
		List<Course> course = courseRepository.findAll();
		return course;
	}

	@Override
	public boolean update(Course course) {
		//update course set name='mtech' , duration =5 where id = 1 ;
		courseRepository.save(course);
		return true;
	}

	@Override
	public boolean delete(int courseId) {
		//DFelete from course where id =1 ;
		courseRepository.deleteById(courseId);
		return true;
	}

}
