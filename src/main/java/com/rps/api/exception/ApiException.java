package com.rps.api.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class ApiException {
	
	private final String errorMessage;
	private final HttpStatus status;
	private final ZonedDateTime timeStamp;
	
	public ApiException(String errorMessage, HttpStatus status, ZonedDateTime timeStamp) {
		this.errorMessage = errorMessage;
		this.status = status;
		this.timeStamp = timeStamp;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public ZonedDateTime getTimeStamp() {
		return timeStamp;
	}
	
	

}
