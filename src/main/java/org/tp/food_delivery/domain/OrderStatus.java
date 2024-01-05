package org.tp.food_delivery.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "orderStatusId")
@ToString(of = {"orderStatusId", "restaurant", "customer", "active"})
public class OrderStatus {

    Integer orderStatusId;
    Restaurant restaurant;
    Customer customer;
    String productName;
    Boolean active;
    String customerEmail;
    String customerName;
    String customerSurname;
    String customerPhone;
    String customerAddressCountry;
    String customerAddressCity;
    String customerAddressPostalCode;
    String customerAddressStreet;
    String customerOrder;
    String restaurantName;
    String orderStatus;
}
