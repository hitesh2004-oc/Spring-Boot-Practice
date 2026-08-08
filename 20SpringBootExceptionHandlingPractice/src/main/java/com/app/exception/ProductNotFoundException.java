package com.app.exception;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
// Product Not Found Exception 
	public ProductNotFoundException() {
		super();
	}
// PNFE Message 
	public ProductNotFoundException(String message) {
		super(message);
	}
}
