package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Model;
import com.app.entity.Product;
import com.app.repo.ModelRepository;
import com.app.repo.ProductRepository;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private ModelRepository modelRepo;

    @Override
    public void run(String... args) throws Exception {

    	Model m1 = new Model(1011,"Xyz","gdfhdfgdf");
    	Model m2 = new Model(1012, "ABC","klksks");
    	Model m3 = new Model(1013,"PQR","ososoo");
    	Model m4 = new Model(1014, "LMO","psosopos");
    	Model m5 = new Model(1015,"KKL","spsooap");
    	Model m6 = new Model(1016, "OOL", "sosooa");
    	Product p1 = new Product(10,"ABCD-XYZ",Arrays.asList(m1,m2));
    	Product p2 = new Product(11,"CMN-MIN",Arrays.asList(m3,m4,m5));
    	
    	modelRepo.save(m1);
    	modelRepo.save(m2);
    	modelRepo.save(m3);
    	modelRepo.save(m4);
    	modelRepo.save(m5);
    	modelRepo.save(m6);
    	
    	productRepo.save(p1);
    	productRepo.save(p2);

    }
}