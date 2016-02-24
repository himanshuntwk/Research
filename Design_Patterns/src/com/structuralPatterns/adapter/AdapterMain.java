package com.structuralPatterns.adapter;

public class AdapterMain {

	public static void main(String[] args){
		
		ProductAdapter productAdapter = new ProductAdapter();
		productAdapter.setProductName("ProductTest");
		productAdapter.setProductNumber(1);
	}
}
