package com.app.prasoon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestDataRunner implements CommandLineRunner{
  
	@Autowired
	private Process pob;
	
	@Override
public void run(String... args) throws Exception {
	
	  pob.setCode("aa");
	  pob.setPort(985);
	   System.out.println(pob);
	   System.out.println(pob.getCode());
	   System.out.println(pob.getPort());
}
}