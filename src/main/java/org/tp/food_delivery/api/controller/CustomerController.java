package org.tp.food_delivery.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.tp.food_delivery.api.dto.AddressDTO;
import org.tp.food_delivery.api.dto.CustomerDTO;
import org.tp.food_delivery.api.dto.mapper.MenuMapper;
import org.tp.food_delivery.api.dto.mapper.CustomerMapper;
import org.tp.food_delivery.buisness.CustomerService;
import org.tp.food_delivery.domain.Customer;

@Controller
@AllArgsConstructor
public class CustomerController {

    private static final String CUSTOMER = "/customers";
    private static final String CUSTOMER_BY_ID = "/customers/{customerId}";
    public static final String CREATE_CUSTOMERS = "/customers/add";

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;
    private final MenuMapper menuMapper;

    @GetMapping(value = CUSTOMER)
    public String customers(Model model) {
        var allCustomers = customerService.findAll().stream()
                .map(customerMapper::map)
                .toList();
        model.addAttribute("customers", allCustomers);
        model.addAttribute("customerDTO", new CustomerDTO());
        return "customers";
    }
//    @PostMapping(CREATE_CUSTOMERS)
//    public String addCustomer(@ModelAttribute("customerDTO") CustomerDTO customerDTO
//    ) {
//        Customer newCustomer = customerMapper.map(customerDTO);
//        customerService.saveCustomer(newCustomer);
//
//        return "redirect:/customers";
//    }

    @GetMapping(value = CUSTOMER_BY_ID)
    public String customerById(@PathVariable Integer customerId, Model model) {
        CustomerDTO customer = customerService.findById(customerId)
                .map(customerMapper::map)
                .orElseThrow(() -> new RuntimeException("Customer with Id [%s] doesn't exists".formatted(customerId)));

        model.addAttribute("customer", customer);
        return "customerDetails";
    }
}

//
// c1_0.customer_id,a1_0.address_id,a1_0.city,a1_0.country,a1_0.postal_code,a1_0.street,c1_0.email,c1_0.name,o1_0.order_status_id,
// o1_0.customer_id,o1_0.date_of_order,o1_0.order_status,o1_0.product_name,o1_0.quantity_of_product,r1_0.customer_id,a2_0.address_id,a2_0.city,a2_0.country,a2_0.postal_code,a2_0.street,r1_0.available_streets,r1_0.email,m1_0.menu_id,c2_0.category_of_product_id,c2_0.category_name,m1_0.price,m1_0.product_name,r1_0.phone,r1_0.customer_name,c1_0.phone,c1_0.surname from customer c1_0 left join address a1_0 on a1_0.address_id=c1_0.address_id left join order_status o1_0 on o1_0.order_status_id=c1_0.order_status_order_status_id left join customer r1_0 on r1_0.customer_id=o1_0.customer_id left join address a2_0 on a2_0.address_id=r1_0.address_id left join menu m1_0 on m1_0.menu_id=r1_0.menu_id left join category_of_product c2_0 on c2_0.category_of_product_id=m1_0.category_of_product_id where c1_0.address_id=?]; SQL [n/a]]
