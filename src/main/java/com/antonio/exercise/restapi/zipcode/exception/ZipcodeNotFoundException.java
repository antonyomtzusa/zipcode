package com.antonio.exercise.restapi.zipcode.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ZipcodeNotFoundException extends RuntimeException{
 
	public ZipcodeNotFoundException() {
    }

    public ZipcodeNotFoundException(String message) {
        super(message);
    }

    public ZipcodeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZipcodeNotFoundException(Throwable cause) {
        super(cause);
    }

    public ZipcodeNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
	
}
