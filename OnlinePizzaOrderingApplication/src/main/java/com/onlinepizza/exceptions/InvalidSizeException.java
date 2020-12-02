package com.onlinepizza.exceptions;

public class InvalidSizeException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidSizeException(String message) {
		super(message);
	}
}
