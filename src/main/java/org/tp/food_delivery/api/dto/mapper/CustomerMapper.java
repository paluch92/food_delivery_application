package org.tp.food_delivery.api.dto.mapper;

import org.mapstruct.Mapper;
import org.tp.food_delivery.api.dto.CustomerDTO;
import org.tp.food_delivery.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDTO map(Customer customer);


}
