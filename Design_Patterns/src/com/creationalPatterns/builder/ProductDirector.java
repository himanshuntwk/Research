package com.creationalPatterns.builder;

public class ProductDirector {
	
	Product createSpecificProduct(ProductCreator productCreator){
		return productCreator.createProduct();
	}
}
