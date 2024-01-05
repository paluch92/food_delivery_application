package org.tp.food_delivery.domain;

import lombok.*;

import java.util.List;

@With
@Value
@Builder
@EqualsAndHashCode(of = "restaurantId")
@ToString(of = {"restaurantId", "restaurantName", "address", "menu", "phone", "email"})
public class Restaurant {

    Integer restaurantId;
    String restaurantName;
    String address;
    String menu;
    String orderStatusId;
    List<Address> availableStreets;
    String phone;
    String email;
    List<OrderStatus> orderStatus;
}
