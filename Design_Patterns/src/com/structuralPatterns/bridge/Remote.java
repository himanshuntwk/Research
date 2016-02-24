package com.structuralPatterns.bridge;

public interface Remote {
	
	public void on();
	public void off();
	public void changeChannel(Integer number);
	
}
