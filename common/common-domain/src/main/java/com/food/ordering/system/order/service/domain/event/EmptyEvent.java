package com.food.ordering.system.order.service.domain.event;

public class EmptyEvent implements DomainEvent<Void>{

    public static final EmptyEvent INSTANCE = new EmptyEvent();

    private EmptyEvent() {
    }
}
