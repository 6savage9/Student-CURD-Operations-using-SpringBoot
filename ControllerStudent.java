package com.spring.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.StudentRepository;
import com.example.dto.Student;

@RestController
public class ControllerStudent {
	
	@Autowired
	StudentRepository sr;
	
	@PostMapping("/addStud")
	public String addStudent(@RequestBody Student s) {
		
		sr.save(s);
		return "Student Added";
	}
	
	@GetMapping("fetchStud")
	public Student fetchStudent(@RequestParam int id) {
		
		Optional<Student> o = sr.findById(id);
		Student s1=o.get();
		return s1;
		
	}
	
	@PutMapping("/upstud")
	public String updateStudent(@RequestBody Student sty) {
		
		sr.save(sty);
		return "Updated";
		
	}
	
	@DeleteMapping("/delstud")
	public String delStudent(@RequestParam int id) {
		
		sr.deleteById(id);
		return "deleted";
	}
	
	@GetMapping("/allData")
	public List<Student> findAll(){
		
		List l=sr.findAll();
		return l;
	}
	
	
}
