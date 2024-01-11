package org.tp.food_delivery.api.dto.mapper;

import org.mapstruct.Mapper;
import org.tp.food_delivery.api.dto.OrderStatusDTO;
import org.tp.food_delivery.domain.OrderStatus;

@Mapper(componentModel = "spring")
public interface OrderStatusMapper {

    OrderStatusDTO map(OrderStatus order);


}
