package com.food.ordering.system.domain.exception;

public class DomainExpcetion extends RuntimeException{

    public DomainExpcetion(String message) {
        super(message);
    }

    public DomainExpcetion(String message, Throwable cause) {
        super(message, cause);
    }
}
