package org.tp.food_delivery.domain;

import lombok.*;

import java.util.List;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuId")
@ToString(of = {"menuId", "restaurantMenu"})
public class Menu {

    Integer menuId;
    String productName;
    CategoryOfProduct categoryOfProduct;
    List<Menu> restaurantMenu;
}
