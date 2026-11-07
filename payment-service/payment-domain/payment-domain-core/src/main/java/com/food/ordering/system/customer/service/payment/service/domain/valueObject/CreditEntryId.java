package com.food.ordering.system.customer.service.payment.service.domain.valueObject;

import com.food.ordering.system.customer.service.order.service.domain.valueobject.BaseId;

import java.util.UUID;

public class CreditEntryId extends BaseId<UUID> {
    public CreditEntryId(UUID value) {
        super(value);
    }
}