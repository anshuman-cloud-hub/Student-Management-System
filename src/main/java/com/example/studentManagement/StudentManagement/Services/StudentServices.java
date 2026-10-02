package com.example.studentManagement.StudentManagement.Services;

import java.util.*;


import org.springframework.stereotype.Service;

import com.example.studentManagement.StudentManagement.Entity.Student;

@Service
public class StudentServices {
	
	private static List< Student > List = new ArrayList<>();
	
	static {
		
		List.add( new Student("Aman", 27, 2026, "java"));
		List.add( new Student("Kunal", 27, 2026, "Python"));
		List.add( new Student("Anshuman", 18, 2026, "Maths"));
		List.add( new Student("Pratham", 21, 2026, "Spring Framework"));
		List.add( new Student("Priyal", 22, 2026, "AI/ML"));
		
		
	}
	
	
	public List<Student> getAllRecords(){
		
		return List;
	}

}
