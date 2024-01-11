package org.tp.food_delivery.infrastuctre.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.tp.food_delivery.domain.Address;
import org.tp.food_delivery.infrastuctre.database.entity.AddressEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressEntityMapper {
    AddressEntity mapToEntity(Address address);

    //    @Mapping(target = "customer", ignore = true)
//    @Mapping(target = "restaurant", ignore = true)
    Address mapFromEntity(AddressEntity entity);
}