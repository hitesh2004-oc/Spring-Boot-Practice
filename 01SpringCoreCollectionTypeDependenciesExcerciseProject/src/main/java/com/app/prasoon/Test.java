package com.app.prasoon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		
		Student s =(Student)ac.getBean("ss");
		System.out.println(s.getName());
		System.out.println(s.getPhones());
		System.out.println(s.getAddresses());
		System.out.println(s.getCourses());
		
	}

}
