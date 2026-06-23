package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
public class ProductionEnvironmentRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ProductionEnvironmentRunner Executed...");

	}

}
