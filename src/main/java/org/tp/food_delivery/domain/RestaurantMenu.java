package org.tp.food_delivery.domain;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class RestaurantMenu {
    List<Menu> availableMenu;


}
