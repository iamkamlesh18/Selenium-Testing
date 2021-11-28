package com.exceptions;

public class InvalidNumberRangeException extends Exception {
    public InvalidNumberRangeException() {
    }

    public InvalidNumberRangeException(String message) {
        super(message);
    }

    public InvalidNumberRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNumberRangeException(Throwable cause) {
        super(cause);
    }

    public InvalidNumberRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
