package com.app.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Product;
import com.app.repo.MyRepository;

@Component
public class TestOperationsRunner implements CommandLineRunner {
         
	@Autowired
	MyRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		Product p1 = new Product(100 , "mirror" , 300.00);
		Product p2 = new Product(101 , "charger" , 500.00);
		Product p3 = new Product(102 , "tape" , 100.00);
		
		// save
		repo.save(p1);
		
		// saveAll
		
	 repo.saveAll(Arrays.asList(p1,p2,p3));
		 
	 //findAll
	 Iterable<Product> data = repo.findAll();
	 
	 for(Product p : data) {
		 System.out.println(p);
		 
		 
		 // java 8
		 
		 data.forEach(ob -> System.out.println(ob));
		 
		 // find by id
		 
		 Optional <Product> opt = repo.findById(100);
		 if(opt.isPresent()) {
			 Product pd = opt.get();
			 System.out.println(pd);
		 }
		 
		 else {
			 
			 System.out.println("no data found ");
		 } 
		 
		 // find all by id 
		 
		Iterable<Product> list =  repo.findAllById(Arrays.asList(100 ,101 ,102));
		 
			list.forEach(System.out :: println);
	 }
}

}