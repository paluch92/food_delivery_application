package org.tp.food_delivery.infrastuctre.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.tp.food_delivery.domain.AllRestaurants;
import org.tp.food_delivery.infrastuctre.database.entity.AllRestaurantsEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AllRestaurantsEntityMapper {
    AllRestaurants mapToEntity(AllRestaurantsEntity allRestaurantsEntity);

}
