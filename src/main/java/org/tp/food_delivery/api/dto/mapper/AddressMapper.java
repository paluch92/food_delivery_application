package org.tp.food_delivery.api.dto.mapper;

import org.mapstruct.Mapper;
import org.tp.food_delivery.api.dto.AddressDTO;
import org.tp.food_delivery.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDTO map(Address address);


}
