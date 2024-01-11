package org.tp.food_delivery.domain;

import lombok.*;

import java.math.BigDecimal;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuId")
@ToString(of = {"menuId", "productName", "price", "restaurantMenu"})
public class Menu {

    Integer menuId;
    String productName;
    BigDecimal price;
    CategoryOfProduct categoryOfProduct;
    Menu restaurantMenu;
}
