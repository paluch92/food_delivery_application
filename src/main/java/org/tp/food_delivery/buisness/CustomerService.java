package org.tp.food_delivery.buisness;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tp.food_delivery.buisness.dao.CustomerDAO;
import org.tp.food_delivery.domain.Customer;
import org.tp.food_delivery.domain.exception.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerDAO customerDAO;


    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }

    public Customer findById(Integer customerId) {
        Optional<Customer> customer = customerDAO.findById(customerId);
        if (customer.isEmpty()) {
            throw new NotFoundException("Could not find customer by Id: [%s]".formatted(customerId));
        }
        return customer.get();
    }


}

