package org.tp.food_delivery.api.dto.mapper;

import org.mapstruct.Mapper;
import org.tp.food_delivery.api.dto.MenuDTO;
import org.tp.food_delivery.domain.Menu;

@Mapper(componentModel = "spring")
public interface MenuMapper {

    MenuDTO map(Menu menu);


}
