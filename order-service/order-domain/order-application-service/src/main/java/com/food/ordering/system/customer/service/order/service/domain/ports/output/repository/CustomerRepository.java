package com.food.ordering.system.customer.service.order.service.domain.ports.output.repository;

import com.food.ordering.system.customer.service.order.service.domain.entity.Customer;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository {

    Optional<Customer> findCustomer(UUID customerId);

    Customer save(Customer customer);
}
