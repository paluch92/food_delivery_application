package org.tp.food_delivery.infrastuctre.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.buisness.dao.CustomerDAO;
import org.tp.food_delivery.domain.Customer;
import org.tp.food_delivery.infrastuctre.database.entity.CustomerEntity;
import org.tp.food_delivery.infrastuctre.database.repository.jpa.CustomerJpaRepository;
import org.tp.food_delivery.infrastuctre.database.repository.mapper.CustomerEntityMapper;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class CustomerRepository implements CustomerDAO {

    private final CustomerJpaRepository customerJpaRepository;
    private final CustomerEntityMapper customerEntityMapper;


    @Override
    public Optional<Customer> findById(Integer customerId) {
        return customerJpaRepository.findById(customerId)
                .map(customerEntityMapper::mapFromEntity);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        CustomerEntity toSave = customerEntityMapper.mapToEntity(customer);
        CustomerEntity saved = customerJpaRepository.save(toSave);
        return customerEntityMapper.mapFromEntity(saved);
    }

    @Override
    public List<Customer> findAll() {
        return customerJpaRepository.findAll().stream()
                .map(customerEntityMapper::mapFromEntity).toList();
    }

}
