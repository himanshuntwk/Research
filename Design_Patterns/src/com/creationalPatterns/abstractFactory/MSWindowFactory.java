package com.creationalPatterns.abstractFactory;

public class MSWindowFactory implements WindowFactory{
	
	public OperatingSystem createOS(){
		return new MSWindow();
	}
}
