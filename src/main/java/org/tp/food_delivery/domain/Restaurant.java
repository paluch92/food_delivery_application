package org.tp.food_delivery.domain;

import lombok.*;
import org.tp.food_delivery.infrastuctre.database.entity.AddressEntity;
import org.tp.food_delivery.infrastuctre.database.entity.MenuEntity;
import org.tp.food_delivery.infrastuctre.database.entity.OrderStatusEntity;
import org.tp.food_delivery.infrastuctre.database.entity.RestaurantEntity;

import java.util.List;
import java.util.stream.Collectors;

@With
@Value
@Builder
@Setter
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
