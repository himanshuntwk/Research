package com.behavioralPatterns.chainOfResponsibility;

public class CORMain {
	/**
	 * @author name Himanshu Sharma
	 * @param args
	 */
	public static void main(String[] args){
		ProductClient client = new ProductClient();
		client.displayData("name");
		client.displayData("category");
	}
}
