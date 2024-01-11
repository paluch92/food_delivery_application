//package org.tp.food_delivery.api.controller.rest;
//
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.tp.food_delivery.api.dto.CustomerDTO;
//import org.tp.food_delivery.buisness.CustomerService;
//import org.tp.food_delivery.domain.Customer;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/customer")
//@AllArgsConstructor
//public class CustomerRestController {
//
//    private final CustomerService customerService;
//
//    @GetMapping
//    public List<Customer> getAllCustomers() {
//        return customerService.findAll();
//    }
//
//    @GetMapping("/{customerId}")
//    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Integer customerId) {
//        Optional<Customer> customerDTO = customerService.findById(customerId);
//        if (customerDTO != null) {
//            return new ResponseEntity<>(customerDTO, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody Customer customer) {
//        CustomerDTO createCustomerDTO = customerService.saveCustomer(customer);
//        return new ResponseEntity<>(createCustomerDTO, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable Integer customerId, @RequestBody CustomerDTO updatedCustomerDTO) {
//        CustomerDTO updatedCustomer = customerService.updateCustomer(customerId, updatedCustomerDTO);
//
//        if (updatedCustomer != null) {
//            return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteCustomer(@PathVariable Integer customerId) {
//        customerService.deleteCustomer(customerId);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//}
