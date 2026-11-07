package com.food.ordering.system.customer.service.payment.service.domain.ports.output.message.publisher;

import com.food.ordering.system.customer.service.outbox.OutboxStatus;
import com.food.ordering.system.customer.service.payment.service.domain.outbox.model.OrderOutboxMessage;

import java.util.function.BiConsumer;

public interface PaymentResponseMessagePublisher {
    void publish(OrderOutboxMessage orderOutboxMessage,
                 BiConsumer<OrderOutboxMessage, OutboxStatus> outboxCallback);
}