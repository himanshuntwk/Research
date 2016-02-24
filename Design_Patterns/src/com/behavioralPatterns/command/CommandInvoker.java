package com.behavioralPatterns.command;

public class CommandInvoker {
	
	public void invokeCommand(CommandInterface command){
		command.execute();
	}
}
