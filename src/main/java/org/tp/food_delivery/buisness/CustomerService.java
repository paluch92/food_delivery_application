package org.tp.food_delivery.buisness;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tp.food_delivery.api.dto.CustomerDTO;
import org.tp.food_delivery.infrastuctre.database.entity.CustomerEntity;
import org.tp.food_delivery.infrastuctre.database.repository.jpa.CustomerJpaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerJpaRepository customerJpaRepository;
    private final ModelMapper modelMapper;


    @Transactional
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        CustomerEntity customer = convertToEntity(customerDTO);
        CustomerEntity createdCustomer = customerJpaRepository.save(customer);
        return convertToDto(createdCustomer);
    }

    public List<CustomerDTO> getAllCustomers() {
        List<CustomerEntity> customerEntity = customerJpaRepository.findAll();
        return customerEntity.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private CustomerDTO convertToDto(CustomerEntity customerEntity) {
        return modelMapper.map(customerEntity, CustomerDTO.class);
    }

    private CustomerEntity convertToEntity(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, CustomerEntity.class);
    }

    @Transactional
    public void deleteCustomer(Integer customerId) {
        customerJpaRepository.deleteById(customerId);
    }

    public CustomerDTO updateCustomer(Integer customerId, CustomerDTO updatedCustomerDTO) {
        CustomerEntity existingCustomer = customerJpaRepository.findById(customerId).orElse(null);

        if (existingCustomer != null) {
            modelMapper.map(updatedCustomerDTO, existingCustomer);
            customerJpaRepository.save(existingCustomer);
            return convertToDto(existingCustomer);
        }

        return null;
    }

    @Transactional
    public CustomerDTO findCustomer(Integer customerId) {
        CustomerEntity customerEntity = customerJpaRepository.findById(customerId).orElse(null);
        return (customerEntity != null ? convertToDto(customerEntity) : null);
    }


}

