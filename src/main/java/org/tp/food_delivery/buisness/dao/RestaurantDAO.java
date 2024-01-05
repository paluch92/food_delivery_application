package org.tp.food_delivery.buisness.dao;

import org.tp.food_delivery.domain.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantDAO {
    List<Restaurant> showAvailableByStreet();

    Optional<Restaurant> findById(Integer restaurantId);

    Restaurant saveRestaurant(Restaurant restaurant);

    void deleteRestaurant(Restaurant restaurant);

}
