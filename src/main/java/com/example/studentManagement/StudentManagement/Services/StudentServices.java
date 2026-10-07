package com.example.studentManagement.StudentManagement.Services;

import java.util.*;


import org.springframework.stereotype.Service;

import com.example.studentManagement.StudentManagement.Entity.Student;

@Service
public class StudentServices {
	
	private static List< Student > List = new ArrayList<>();
	
	static {
		
		List.add( new Student("Aman", 27, 101, "java"));
		List.add( new Student("Kunal", 27, 102, "Python"));
		List.add( new Student("Anshuman", 18, 103, "Maths"));
		List.add( new Student("Pratham", 21, 104, "Spring Framework"));
		List.add( new Student("Priyal", 22, 105, "AI/ML"));
		
		
	}
	
	
	public List<Student> getAllRecords(){
		
		return List;
	}
	
	
	public Student getRecordsById(int id){
		
		Student record = null;
		
		for(int i = 0; i<List.size();i++) {
			if(List.get(i).getId() == id)
				record = List.get(i);
		}
		return record;
	}
	
	
	public List<Student> getRecordsByDomain(String domain) {
		
		List<Student> data = new ArrayList<>();
		
		for(int i = 0; i<List.size();i++) {
			if(List.get(i).getDomain().equalsIgnoreCase(domain))
			data.add(List.get(i));
		}
		
		return data;
		
	}

}
