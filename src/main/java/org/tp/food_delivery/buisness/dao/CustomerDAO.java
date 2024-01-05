package org.tp.food_delivery.buisness.dao;

import org.tp.food_delivery.domain.Customer;

import java.util.Optional;

public interface CustomerDAO {
    Optional<Customer> findById(Integer customerId);

    Customer saveCustomer(Customer customer);

    Customer deleteCustomer(Customer customer);


}
