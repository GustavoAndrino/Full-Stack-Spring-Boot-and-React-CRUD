package com.Fullstack_app.fullstack_backend.exceptions;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(Long id) {
		super("User not found. Id: " + id);
	}
}
