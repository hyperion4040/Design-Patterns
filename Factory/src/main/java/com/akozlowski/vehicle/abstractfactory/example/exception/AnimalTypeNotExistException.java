package com.akozlowski.vehicle.abstractfactory.example.exception;

public class AnimalTypeNotExistException extends Exception {
    public AnimalTypeNotExistException(final String message) {
        super(message);
    }
}
