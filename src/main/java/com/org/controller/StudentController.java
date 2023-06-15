package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.entity.Student;
import com.org.services.StudentServices;

@RestController
public class StudentController {
	
	@Autowired
	public StudentServices studentServices;
	
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return studentServices.getAllStudent();
	}
	
	@PostMapping("/student")
	public void addStudent(@RequestBody Student student) {
		studentServices.addStudent(student);
	}
	
	@PutMapping("/student/{id}")
	public void updateStudent(@PathVariable int id, @RequestBody Student student){
		
		studentServices.updateStudent(id, student);
		
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentServices.deleteStudent(id);
	}

}
