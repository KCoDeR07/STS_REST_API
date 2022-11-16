package com.springrest.SpringREST.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringREST.Services.CourseService;
import com.springrest.SpringREST.entitites.Course;

@RestController 
public class Conntrollers {

	@Autowired
	private CourseService courseserv;	

	@GetMapping("/home")
	public String home() {
		return "Welcome to my home page ";
	}

	@GetMapping("/courses")
	public List<Course> getCourse(){
		return this.courseserv.getCourses();

	}
	@GetMapping("/course/{inp_id}")
	public Course find_course(@PathVariable String inp_id){
		return this.courseserv.find_course(inp_id);
	}
	
	@PostMapping("/addcourse")
	public void Add_cour(@RequestBody Course cour) {
		this.courseserv.Add_course(cour);
	}

}
