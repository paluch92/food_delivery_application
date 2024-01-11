package org.tp.food_delivery.infrastuctre.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.tp.food_delivery.domain.CategoryOfProduct;
import org.tp.food_delivery.infrastuctre.database.entity.CategoryOfProductEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryOfProductEntityMapper {
    @Mapping(target = "menu", ignore = true)
    CategoryOfProduct mapFromEntity(CategoryOfProductEntity categoryOfProduct);
}
