package com.behavioralPatterns.command;

public class DeleteCommandReceiver implements CommandInterface{
	public void execute(){
		System.out.println("Delete Command Executed");
	}
}
