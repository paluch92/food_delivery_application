package org.tp.food_delivery.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

    Integer addressId;
    String country;
    String city;
    String postalCode;
    String street;
//    CustomerDTO customer;
//    RestaurantDTO restaurant;
}