package org.tp.food_delivery.domain;

import lombok.*;

import java.util.List;

@With
@Value
@Builder
@EqualsAndHashCode(of = "customerId")
@ToString(of = {"customerId", "name", "surname", "phone", "address", "orderStatus"})
public class Customer {

    Integer customerId;
    String name;
    String surname;
    String phone;
    String email;
    Address address;
    List<OrderStatus> orderStatus;
}
