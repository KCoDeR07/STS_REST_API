package com.springrest.SpringREST.Services;

import java.util.List;

import com.springrest.SpringREST.entitites.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course find_course(String inp_id); 
	
	public String Add_course(Course course);
	
}
