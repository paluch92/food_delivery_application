package org.tp.food_delivery.infrastuctre.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.domain.Restaurant;
import org.tp.food_delivery.infrastuctre.database.entity.RestaurantEntity;

import java.util.List;

@Repository
public interface RestaurantJpaRepository extends JpaRepository<RestaurantEntity, Integer> {
    List<Restaurant> findAvailableByStreet(String street);


}
