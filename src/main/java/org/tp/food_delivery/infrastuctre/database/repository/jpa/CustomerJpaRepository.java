package org.tp.food_delivery.infrastuctre.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.domain.Customer;
import org.tp.food_delivery.infrastuctre.database.entity.CustomerEntity;

import java.util.Optional;

@Repository
public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, Integer> {
    Optional<CustomerEntity> findById(Integer customerId);

    Customer saveCustomer(Customer customer);

    Customer deleteCustomer(Customer customer);

}
