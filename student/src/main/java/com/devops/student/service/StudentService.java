package com.devops.student.service;

import java.util.List;

import com.devops.student.domain.Student;

public interface StudentService {

	Student insert(Student student);
	List<Student> findAll();
	
}
