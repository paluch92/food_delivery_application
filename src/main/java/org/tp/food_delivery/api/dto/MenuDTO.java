package org.tp.food_delivery.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {


    private String productName;
    private CategoryOfProductDTO categoryOfProduct;
    private List<MenuDTO> restaurantMenu;
}
