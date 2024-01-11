package org.tp.food_delivery.buisness;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tp.food_delivery.buisness.dao.RestaurantDAO;
import org.tp.food_delivery.domain.Restaurant;
import org.tp.food_delivery.infrastuctre.database.repository.mapper.RestaurantEntityMapper;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RestaurantService {


    private final RestaurantDAO restaurantDAO;
    private final RestaurantEntityMapper restaurantEntityMapper;

    @Transactional
    public void saveRestaurant(Restaurant restaurant) {
        restaurantDAO.saveRestaurant(restaurant);
    }

    public List<Restaurant> findAll() {
        return restaurantDAO.findAll();
    }


    public Optional<Restaurant> findById(Integer restaurantId) {
//        Optional<Restaurant> restaurant = restaurantDAO.findById(restaurantId);
//        if (restaurant.isEmpty()) {
//            throw new NotFoundException("Could not find restaurant by Id: [%s]".formatted(restaurantId));
//        }
        return restaurantDAO.findById(restaurantId);
    }

//    public List<Restaurant> showAvailableByStreet(Address street) {
//        return restaurantDAO.findAll().stream()
//                .filter(restaurantEntity -> restaurantEntity.getAddress().equals(street))
//                .map()
//                .toList();
//    }

}
