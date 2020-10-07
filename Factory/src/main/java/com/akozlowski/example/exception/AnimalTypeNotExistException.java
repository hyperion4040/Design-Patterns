package com.akozlowski.example.exception;

public class AnimalTypeNotExistException extends Exception {
    public AnimalTypeNotExistException(final String message) {
        super(message);
    }
}
