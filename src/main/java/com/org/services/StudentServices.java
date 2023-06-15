package com.org.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.StudentRepo;
import com.org.entity.Student;

@Service
public class StudentServices {
	
	@Autowired
	public StudentRepo studentRepo;
	
	public List<Student> getAllStudent(){
		
		List<Student> student = new ArrayList<>();
		studentRepo.findAll().forEach(student::add);
		return student;
		
	}

	public void addStudent(Student student) {
		
		studentRepo.save(student);
		
	}

	public void updateStudent(int id, Student student) {
		studentRepo.save(student);
		
	}

	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
		
	}
	
	

}
