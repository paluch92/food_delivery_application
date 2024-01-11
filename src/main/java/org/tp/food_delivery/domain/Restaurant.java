package org.tp.food_delivery.domain;

import lombok.*;

@With
@Value
@Builder
@Setter
@EqualsAndHashCode(of = "restaurantId")
@ToString(of = {"restaurantId", "restaurantName", "address", "phone", "email"})
public class Restaurant {

    Integer restaurantId;
    String restaurantName;
    String availableStreets;
    String phone;
    String email;
    Address address;
//    Menu menu;


}
