package org.tp.food_delivery.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderStatusDTO {
    Integer orderStatusId;
    String productName;
    BigDecimal quantityOfProduct;
    OffsetDateTime dateOfOrder;
    String orderStatus;
    RestaurantDTO restaurant;
    CustomerDTO customer;
}
