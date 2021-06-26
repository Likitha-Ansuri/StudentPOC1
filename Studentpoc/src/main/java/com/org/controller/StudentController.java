package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.model.Student;
import com.org.services.StudentService;

@RestController
@RequestMapping("/app/student")
public class StudentController {
	
	@Autowired
	StudentService stdser;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return stdser.createStudent(student);
	}
	
	@GetMapping("/displayall")
	public Iterable<Student> getAll() {
		return stdser.getAll();
	} 
}
