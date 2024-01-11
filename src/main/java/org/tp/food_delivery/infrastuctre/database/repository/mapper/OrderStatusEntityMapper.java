package org.tp.food_delivery.infrastuctre.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.tp.food_delivery.domain.OrderStatus;
import org.tp.food_delivery.infrastuctre.database.entity.OrderStatusEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderStatusEntityMapper {

    OrderStatusEntity mapToEntity(OrderStatus orderStatus);

    @Mapping(target = "restaurant", ignore = true)
    @Mapping(target = "customer", ignore = true)
    OrderStatus mapFromEntity(OrderStatusEntity orderStatus);


}
