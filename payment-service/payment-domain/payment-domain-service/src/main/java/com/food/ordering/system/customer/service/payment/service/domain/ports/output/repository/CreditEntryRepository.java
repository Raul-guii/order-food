package com.food.ordering.system.customer.service.payment.service.domain.ports.output.repository;

import com.food.ordering.system.customer.service.order.service.domain.valueobject.CustomerId;
import com.food.ordering.system.customer.service.payment.service.domain.entity.CreditEntry;

import java.util.Optional;

public interface CreditEntryRepository {

    CreditEntry save(CreditEntry creditEntry);

    Optional<CreditEntry> findByCustomerId(CustomerId customerId);
}