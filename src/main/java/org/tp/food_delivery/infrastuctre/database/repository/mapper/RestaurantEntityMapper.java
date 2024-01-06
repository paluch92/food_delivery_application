//package org.tp.food_delivery.infrastuctre.database.repository.mapper;
//
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.ReportingPolicy;
//import org.tp.food_delivery.domain.Restaurant;
//import org.tp.food_delivery.infrastuctre.database.entity.RestaurantEntity;
//
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//public interface RestaurantEntityMapper {
//
//    @Mapping(target = "orderStatus", ignore = true)
//    Restaurant mapFromEntity(RestaurantEntity entity);
//
//    RestaurantEntity mapToEntity(Restaurant restaurant);
//}
