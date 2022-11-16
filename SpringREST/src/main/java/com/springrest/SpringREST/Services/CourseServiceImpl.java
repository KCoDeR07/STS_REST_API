package com.springrest.SpringREST.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springrest.SpringREST.entitites.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	public CourseServiceImpl() {

		// TODO Auto-generated constructor stub
		list = new ArrayList<>();

		list.add(new Course(556, "JAVA ", "In one videos"));

		list.add(new Course(965, "Sprint boot ", "Full courser"));

	}


	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public Course find_course(@PathVariable String inp_id) {
		// TODO Auto-generated method stub
		Course co = null;

		for (Course course : list) {

			if(course.getId() == Double.parseDouble(inp_id)) 
				co = course;

			else {
				co = new Course();
				co.setDesc("no course of this id is there please give valid course id");
			}
		}		
		return co;
	}


	@Override
	public String Add_course(Course course ) {
		// TODO Auto-generated method stub
		list.add(course);
		return " course Successfully added in list";
	}

}// end of file
