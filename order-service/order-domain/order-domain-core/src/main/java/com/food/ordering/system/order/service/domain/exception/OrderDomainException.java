package com.food.ordering.system.order.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainExpcetion;

public class OrderDomainException extends DomainExpcetion {

    public OrderDomainException(String message) {
        super(message);
    }

    public OrderDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
