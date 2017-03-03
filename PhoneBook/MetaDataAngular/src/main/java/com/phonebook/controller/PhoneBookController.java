package com.phonebook.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phonebook.dto.User;

@Controller
public class PhoneBookController {

	@RequestMapping("/phonebook")
	public String phonebook(Map<String, Object> model) {
		// model.put("message", this.message);
		return "phonebook/phonebook";
	}

	@ResponseBody
	@RequestMapping("/testingService")
	public User testingService(Map<String, Object> model) {
		User userObj = new User();
		Random random = new Random();
		int value = random.nextInt(50);
		userObj.setName("ServerUser_" + value);
		userObj.setNumber(value);
		return userObj;
	}

}
