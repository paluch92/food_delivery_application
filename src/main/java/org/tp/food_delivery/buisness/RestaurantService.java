package org.tp.food_delivery.buisness;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tp.food_delivery.api.dto.RestaurantDTO;
import org.tp.food_delivery.infrastuctre.database.entity.RestaurantEntity;
import org.tp.food_delivery.infrastuctre.database.repository.jpa.RestaurantJpaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RestaurantService {


    private final RestaurantJpaRepository restaurantJpaRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO) {
        RestaurantEntity restaurant = convertToEntity(restaurantDTO);
        RestaurantEntity createdRestaurant = restaurantJpaRepository.save(restaurant);
        return convertToDto(createdRestaurant);
    }

    public List<RestaurantDTO> getAllRestaurants() {
        List<RestaurantEntity> restaurantEntity = restaurantJpaRepository.findAll();
        return restaurantEntity.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private RestaurantDTO convertToDto(RestaurantEntity restaurantEntity) {
        return modelMapper.map(restaurantEntity, RestaurantDTO.class);
    }

    private RestaurantEntity convertToEntity(RestaurantDTO restaurantDTO) {
        return modelMapper.map(restaurantDTO, RestaurantEntity.class);
    }

    @Transactional
    void deleteRestaurant(RestaurantEntity restaurantId) {
        restaurantJpaRepository.delete(restaurantId);
    }

    @Transactional
    public RestaurantDTO findRestaurant(Integer restaurantId) {
        RestaurantEntity restaurantEntity = restaurantJpaRepository.findById(restaurantId).orElse(null);
        return (restaurantEntity != null ? convertToDto(restaurantEntity) : null);
    }

}
