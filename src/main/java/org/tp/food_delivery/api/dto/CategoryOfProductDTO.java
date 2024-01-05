package org.tp.food_delivery.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryOfProductDTO {
    private String categoryName;
    private MenuDTO menu;
}