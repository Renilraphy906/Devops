package com.devops.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.student.domain.Student;
import com.devops.student.service.StudentService;

@RestController
@RequestMapping("/docker_demo")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
		
	}
	
	@GetMapping("/add/name={name}")
	public Student newStudent(@PathVariable String name)
	{
		Student student = new Student();
		student.setName(name);
		
		return studentService.insert(student);
		
	}
	
	@GetMapping("/findall")
	public List<Student> findStudent(){
		return studentService.findAll();
		
	}
	
}
