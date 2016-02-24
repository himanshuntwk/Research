package com.behavioralPatterns.strategy;

public class Invoker {
	
	public Invoker(Calculate calculate,int num1,int num2){
		calculate.executeOperation(num1, num2);
	}
}
