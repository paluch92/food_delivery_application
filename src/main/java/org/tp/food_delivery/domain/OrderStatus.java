package org.tp.food_delivery.domain;

import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = "orderStatusId")
@ToString(of = {"orderStatusId", "restaurant", "customer", "orderStatus"})
public class OrderStatus {

    Integer orderStatusId;
    String productName;
    BigDecimal quantityOfProduct;
    OffsetDateTime dateOfOrder;
    String orderStatus;
    Restaurant restaurant;
    Customer customer;
}
