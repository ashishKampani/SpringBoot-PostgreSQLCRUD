package com.ashish.restdemo.exception;

public class CloudVendorNotFoundException extends RuntimeException{

    public CloudVendorNotFoundException(String message) {
        super(message);
    }

    public CloudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

   /* The second constructor with both String message and Throwable cause is useful
   when you want to provide more detailed information about the exception,
   including the reason for the exception (message) and the underlying cause (cause).
   It enhances the information available for debugging and error analysis.*/
}
