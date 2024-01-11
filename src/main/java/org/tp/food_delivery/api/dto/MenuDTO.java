package org.tp.food_delivery.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {

    Integer menuId;
    String productName;
    BigDecimal price;
     CategoryOfProductDTO categoryOfProduct;
     RestaurantDTO restaurantMenu;
}
