package com.login.util;

public class Util {
	
	public boolean authenticate(String userId, String password) {

		if (userId.equals("besant") && password.equals("1234")) {
			return true;
		}
		return false;
	}

}
