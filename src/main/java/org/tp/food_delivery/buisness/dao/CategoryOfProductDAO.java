package org.tp.food_delivery.buisness.dao;

import org.tp.food_delivery.domain.CategoryOfProduct;

import java.util.Optional;

public interface CategoryOfProductDAO {
    Optional<CategoryOfProduct> findById(Integer categoryOfProductId);
}
