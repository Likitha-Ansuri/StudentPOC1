package com.org.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.org.dao.StudentDao;
import com.org.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao stddao;
	
	public Student createStudent(Student student) {
		return stddao.save(student);
	}
	
	public Optional<Student> getById(Integer stdId) {
		return stddao.findById(stdId);
	}
	
	public Iterable<Student> getAll() {
		return stddao.findAll();
	}
}
