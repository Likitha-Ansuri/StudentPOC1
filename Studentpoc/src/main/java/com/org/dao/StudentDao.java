package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.org.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}

