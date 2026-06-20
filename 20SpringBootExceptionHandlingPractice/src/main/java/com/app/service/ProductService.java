package com.app.service;

import org.springframework.stereotype.Service;

import com.app.entity.Product;
import com.app.exception.ProductNotFoundException;

@Service
public class ProductService {

	public Product getOneProductById(Integer id) {

		if(id == 150) {
			return new Product(id, "Dummy");
		} else {
			throw new ProductNotFoundException("Product '" + id + "' Not EXIST");
		}
	}
}