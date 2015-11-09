package com.practice.dhyey.Service;

import java.util.HashMap;

import com.practice.dhyey.dto.User;

public class LoginService {
	HashMap<String, String> users = new HashMap<String, String>();
	public LoginService(){
		users.put("johndoe", "John Doe");
		users.put("janedoe", "Jane Doe");
		users.put("jguru", "Java Guru");
	}
	
	public boolean authenticate(String userId, String password){
		if(password == null || password.trim().equals("")){
			return false;
		}
		return true;
	}
	
	public User getUserDetials(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}
}
