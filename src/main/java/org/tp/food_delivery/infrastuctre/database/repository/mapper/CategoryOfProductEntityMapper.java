package org.tp.food_delivery.infrastuctre.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.tp.food_delivery.domain.CategoryOfProduct;
import org.tp.food_delivery.infrastuctre.database.entity.CategoryOfProductEntity;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryOfProductEntityMapper {
    CategoryOfProduct mapFromEntity(List<CategoryOfProductEntity> categoryOfProduct);
}
