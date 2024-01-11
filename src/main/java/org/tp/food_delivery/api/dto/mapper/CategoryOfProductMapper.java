package org.tp.food_delivery.api.dto.mapper;

import org.mapstruct.Mapper;
import org.tp.food_delivery.api.dto.CategoryOfProductDTO;
import org.tp.food_delivery.domain.CategoryOfProduct;

@Mapper(componentModel = "spring")
public interface CategoryOfProductMapper {

    CategoryOfProductDTO map(CategoryOfProduct categoryOfProduct);


}
