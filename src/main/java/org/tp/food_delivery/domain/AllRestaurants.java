package org.tp.food_delivery.domain;

import lombok.*;

import java.util.List;

@With
@Value
@Builder
@EqualsAndHashCode(of = "allRestaurantsId")
@ToString(of = {"allRestaurants"})
public class AllRestaurants {

    Integer allRestaurantsId;
    List<Restaurant> allRestaurants;
}
