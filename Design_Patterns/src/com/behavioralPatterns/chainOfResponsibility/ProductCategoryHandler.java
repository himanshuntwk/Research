package com.behavioralPatterns.chainOfResponsibility;

public class ProductCategoryHandler implements ProductHandler{

	@Override
	public void displayData(String type) {
		
		if(type.equalsIgnoreCase("category")){
			System.out.println("Product Category Handler Processed");
		}
		
	}
	
}
