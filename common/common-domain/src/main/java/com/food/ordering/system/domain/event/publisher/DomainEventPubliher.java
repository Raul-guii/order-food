package com.food.ordering.system.domain.event.publisher;

import com.food.ordering.system.domain.event.DomainEvent;

public interface DomainEventPubliher <T extends DomainEvent> {

    void publish (T domainEvent);
}
