package com.ashish.restdemo.exception;

import org.springframework.http.HttpStatus;

public class CloudVendorException {
    private final String message;

    public String getMessage() {
        return message;
    }

    public CloudVendorException(String message) {
        this.message = message;
    }
}
