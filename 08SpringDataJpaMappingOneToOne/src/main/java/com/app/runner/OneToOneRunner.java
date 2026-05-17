package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Login;
import com.app.entity.Student;
import com.app.repo.LoginRepo;
@Component
public class OneToOneRunner implements CommandLineRunner {
     
	@Autowired
	private LoginRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student s = new Student();
		s.setSId(2);
		s.setSName("hitesh");
		s.setSAddress("pali");
		
		Login l = new Login();
		l.setLoginId(102);
		l.setUserName("hitesh@123");
		l.setPassword("1234");
		l.setStudent(s);
		
		
		repo.save(l);
		
	}
}