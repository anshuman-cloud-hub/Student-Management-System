package com.example.studentManagement.StudentManagement.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentManagement.StudentManagement.Entity.Student;
import com.example.studentManagement.StudentManagement.Services.StudentServices;

@RestController
public class StudentController {
	
	private final StudentServices studentServices;

	public StudentController(StudentServices studentServices) {
		
		this.studentServices = studentServices;
	}
	
	@RequestMapping("/home")
	public List<Student> getAllRecords(){
		return studentServices.getAllRecords();
	}
	
	@GetMapping("/getRecordsById/{id}")
	public Student getRecordsById(@PathVariable("id") int id){
		return studentServices.getRecordsById(id);
	}
	
	@GetMapping("/getRecordsByDomain/{domain}")
	public List<Student> getRecordsByDomain(@PathVariable("domain") String domain){
		return studentServices.getRecordsByDomain(domain);
	}
		
		
}


