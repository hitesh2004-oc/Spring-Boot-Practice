package com.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.Product;

public interface MyRepository extends CrudRepository<Product , Integer> {

}