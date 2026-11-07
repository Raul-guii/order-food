package com.food.ordering.system.customer.service.payment.service.domain.ports.output.repository;

import com.food.ordering.system.customer.service.order.service.domain.valueobject.CustomerId;
import com.food.ordering.system.customer.service.payment.service.domain.entity.CreditHistory;

import java.util.List;
import java.util.Optional;

public interface CreditHistoryRepository {

    CreditHistory save(CreditHistory creditHistory);

    Optional<List<CreditHistory>> findByCustomerId(CustomerId customerId);
}