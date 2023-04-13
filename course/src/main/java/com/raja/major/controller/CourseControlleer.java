package com.raja.major.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raja.major.entity.Course;
import com.raja.major.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseControlleer {
	
	@Autowired
	CourseService courseService;
	
	@PostMapping("/create")
	public boolean create(@RequestBody Course course) {
		return courseService.create(course);
		
	}
	
	@GetMapping("/all")
	public List<Course> getAll(){
		return courseService.getAll();
		
	}
	
	@GetMapping("/id")
	public Course getById(@RequestParam(value ="id",defaultValue = "1")int id) {
		return courseService.getById(id);
		
	}
	@PutMapping("/update")
	public boolean update(@RequestBody Course course) {
		return courseService.update(course);
		
	}
	@DeleteMapping("/delte")
	public boolean delete(@RequestParam int id) {
		return courseService.delete(id);
		
	}
	

}
