package org.tp.food_delivery.api.dto.mapper;

import org.mapstruct.Mapper;
import org.tp.food_delivery.api.dto.RestaurantDTO;
import org.tp.food_delivery.domain.Restaurant;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {

    RestaurantDTO map(Restaurant restaurant);


}
