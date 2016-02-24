package com.behavioralPatterns.state;

public class StopState implements State{
	
	public void action(){
		System.out.println("Stop State");
	}
	
	public StopState(Machine machine){
		machine.setState(this);
	}
}
