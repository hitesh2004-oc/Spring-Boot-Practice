package com.app.runner;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.app.entity.Student;
import com.app.repo.MyRepository;

@Component
public class TestRunner implements CommandLineRunner {
      
	@Autowired
	private MyRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		Student s = new Student();
		s.setStdName("Hitesh");
		s.setStdFee(5000.00);
		s.setStdDoj(new Date());
		
		repo.save(s);
		
		// List 
		
	List<Student> list = repo.findAll();
	 System.out.println(list.getClass().getName());
	
	 list.forEach(System.out::println);
	
	  // Example Interface 
//	 Student s2 = new Student();
//	 s2.setStdName("ajay");
//	 s2.setStdFee(6000.00);
//	 s2.setStdDoj(new Date());
//	 
//	 repo.save(s2);
//	 
//	 Example<Student> prob = Example.of(s2);
//	 
//	 repo.findAll(prob).forEach(System.out::println);
	 
	}
}