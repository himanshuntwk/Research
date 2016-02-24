package com.behavioralPatterns.state;

public class StartState implements State{
	
	public void action(){
		System.out.println("Start State");
	}
	
	public StartState(Machine machine){
		machine.setState(this);
	}
	
}
