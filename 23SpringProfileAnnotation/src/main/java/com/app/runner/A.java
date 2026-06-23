package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class A implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("A Runner Executed..");

	}

}
