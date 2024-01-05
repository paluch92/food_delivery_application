package org.tp.food_delivery.buisness;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tp.food_delivery.buisness.dao.CustomerDAO;
import org.tp.food_delivery.domain.Customer;
import org.tp.food_delivery.domain.exception.NotFoundException;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerDAO customerDAO;
    private final Customer customer;

    @Transactional
    public Customer findCustomer(Integer customerId) {
        Optional<Customer> customer = customerDAO.findById(customerId);
        if (customer.isEmpty()) {
            throw new NotFoundException("Couldn't find customer by Id: [%s]".formatted(customerId));
        }
        return customer.get();
    }

    @Transactional
    public Customer saveCustomer(Customer NewCustomer) {
        return null;

    }

    Customer deleteCustomer(Customer customer){
        return null;

    }
    @Transactional
    public void saveOrder(Customer customer) {
        return;
    }


}

