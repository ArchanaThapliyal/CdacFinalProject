package com.app.custom_exception;

@SuppressWarnings("serial")
public class CakeNotFoundException extends RuntimeException {
	public CakeNotFoundException(String mesg) {
		super(mesg);
	}

}
