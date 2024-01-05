package org.tp.food_delivery.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "categoryOfProductId")
@ToString(of = {"categoryOfProductId", "categoryName"})
public class CategoryOfProduct {

    Integer categoryOfProductId;
    String categoryName;
    Menu menu;
}
