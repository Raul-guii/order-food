package com.food.ordering.system.customer.service.outbox;

public interface OutboxScheduler {
    void processOutboxMessage();
}
