package com.onlinepizza.exceptions;

import com.onlinepizza.model.Coupan;

public class CoupanIdNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CoupanIdNotFoundException(String message) {
		super(message);
	}

}
