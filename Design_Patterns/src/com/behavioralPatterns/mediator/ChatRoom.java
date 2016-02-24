package com.behavioralPatterns.mediator;

public class ChatRoom {
	public void showMessage(User user, String message){
		System.out.println(user.getName() + "<>" + message);
	}
}
