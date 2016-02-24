package com.behavioralPatterns.templateMethod;

public abstract class Game {
	
	public void sequence(){
		start();
		progress();
		stop();
	}
	
	public abstract void start();
	public abstract void progress();
	public abstract void stop();
}
