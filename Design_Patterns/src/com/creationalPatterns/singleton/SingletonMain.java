package com.creationalPatterns.singleton;

public class SingletonMain {

	public static void main(String[] args){
		SingletonProduct  singleObj = SingletonProduct.getSingleInstance(); 
		singleObj.printSingleton();
	}
}
