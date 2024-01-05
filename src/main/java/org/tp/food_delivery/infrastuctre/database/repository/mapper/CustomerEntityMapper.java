package org.tp.food_delivery.infrastuctre.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.tp.food_delivery.domain.Customer;
import org.tp.food_delivery.infrastuctre.database.entity.CustomerEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerEntityMapper {
    @Mapping(target = "orderStatus", ignore = true)
    Customer mapFromEntity(CustomerEntity entity);

    CustomerEntity mapToEntity(Customer customer);
}

