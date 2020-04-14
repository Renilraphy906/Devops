package com.devops.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.student.domain.Student;
import com.devops.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
		
	}
	
	@PostMapping("/add")
	public Student newStudent(@RequestBody Student student)
	{
		return studentService.insert(student);
		
	}
	
	@GetMapping("/find")
	public List<Student> findStudent(){
		return studentService.findAll();
		
	}
	
}
