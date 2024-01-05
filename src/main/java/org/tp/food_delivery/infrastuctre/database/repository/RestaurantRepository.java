package org.tp.food_delivery.infrastuctre.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.buisness.dao.RestaurantDAO;
import org.tp.food_delivery.domain.Restaurant;
import org.tp.food_delivery.infrastuctre.database.entity.RestaurantEntity;
import org.tp.food_delivery.infrastuctre.database.repository.jpa.RestaurantJpaRepository;
import org.tp.food_delivery.infrastuctre.database.repository.mapper.RestaurantEntityMapper;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class RestaurantRepository implements RestaurantDAO {

    private final RestaurantJpaRepository restaurantJpaRepository;

    private final RestaurantEntityMapper restaurantEntityMapper;

    @Override
    public List<Restaurant> showAvailableByStreet() {
        return restaurantJpaRepository.findAll().stream()
                .map(restaurantEntityMapper::mapFromEntity)
                .toList();
    }

    @Override
    public Optional<Restaurant> findById(Integer restaurantId) {
        return restaurantJpaRepository.findById(restaurantId)
                .map(restaurantEntityMapper::mapFromEntity);
    }

    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        RestaurantEntity toSave = restaurantEntityMapper.mapToEntity(restaurant);
        RestaurantEntity saved = restaurantJpaRepository.save(toSave);
        return restaurantEntityMapper.mapFromEntity(saved);
    }

    @Override
    public void deleteRestaurant(Restaurant restaurant) {
        restaurantJpaRepository.deleteRestaurant(restaurant);
    }
}
