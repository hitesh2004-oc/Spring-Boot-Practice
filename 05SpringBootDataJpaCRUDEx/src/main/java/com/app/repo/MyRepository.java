package com.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.Product;
// To Perform CRUD Operation
public interface MyRepository extends CrudRepository<Product , Integer> {

}
