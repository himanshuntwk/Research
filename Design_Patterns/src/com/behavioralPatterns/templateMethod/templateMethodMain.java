package com.behavioralPatterns.templateMethod;

public class templateMethodMain {
	
	public static void main(String[] args){
		Game football = new Football();
		football.sequence();
		Game cricket = new Cricket();
		cricket.sequence();
	}
}
