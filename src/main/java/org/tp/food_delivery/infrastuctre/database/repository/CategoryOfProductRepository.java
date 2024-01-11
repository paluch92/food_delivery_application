package org.tp.food_delivery.infrastuctre.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.buisness.dao.CategoryOfProductDAO;
import org.tp.food_delivery.domain.CategoryOfProduct;
import org.tp.food_delivery.infrastuctre.database.repository.jpa.CategoryOfProductJpaRepository;
import org.tp.food_delivery.infrastuctre.database.repository.mapper.CategoryOfProductEntityMapper;

import java.util.Optional;

@Repository
@AllArgsConstructor

public class CategoryOfProductRepository implements CategoryOfProductDAO {

    private final CategoryOfProductJpaRepository categoryOfProductJpaRepository;
    private final CategoryOfProductEntityMapper categoryOfProductEntityMapper;

    @Override
    public Optional<CategoryOfProduct> findById(Integer categoryOfProductId) {
        return categoryOfProductJpaRepository.findById(categoryOfProductId)
                .map(categoryOfProductEntityMapper::mapFromEntity);
    }
}
