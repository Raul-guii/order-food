package com.food.ordering.system.customer.service.saga;

public interface SagaStep<T> {
    void process(T data);
    void rollback(T data);
}