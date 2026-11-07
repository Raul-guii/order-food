package com.food.ordering.system.customer.service.payment.service.domain.valueObject;

import com.food.ordering.system.customer.service.order.service.domain.valueobject.BaseId;

import java.util.UUID;

public class CreditHistoryId extends BaseId<UUID> {
    public CreditHistoryId(UUID value) {
        super(value);
    }
}
