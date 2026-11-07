package com.food.ordering.system.customer.service.order.service.domain.valueobject;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {

    public TrackingId(UUID value) {
        super(value);
    }
}
