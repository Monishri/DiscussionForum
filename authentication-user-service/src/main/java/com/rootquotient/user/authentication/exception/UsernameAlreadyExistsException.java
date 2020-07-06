package com.rootquotient.user.authentication.exception;


public class UsernameAlreadyExistsException extends Exception {
	public String getMessage() {
		return "User already exists. Try another username";
	}
}
