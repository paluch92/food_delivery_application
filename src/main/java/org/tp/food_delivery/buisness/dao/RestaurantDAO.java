package org.tp.food_delivery.buisness.dao;

import org.tp.food_delivery.domain.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantDAO {
    Optional<Restaurant> findById(Integer restaurantId);

    List<Restaurant> findAll();

    Restaurant saveRestaurant(Restaurant restaurant);

    List<Restaurant> showAvailableByStreet(String street);


}
