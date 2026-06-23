package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"qa","prod","dev"})
@Component
public class MultiEnvironment implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Multi Environment Executed...");

	}

}
