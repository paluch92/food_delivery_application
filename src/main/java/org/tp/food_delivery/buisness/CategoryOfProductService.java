package org.tp.food_delivery.buisness;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.tp.food_delivery.buisness.dao.CategoryOfProductDAO;
import org.tp.food_delivery.domain.CategoryOfProduct;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class CategoryOfProductService {

    private final CategoryOfProductDAO categoryOfProductDAO;

    Optional<CategoryOfProduct> findById(Integer categoryOfProductId) {
        Optional<CategoryOfProduct> byId = categoryOfProductDAO.findById(categoryOfProductId);
        if (byId.isEmpty()) {
            throw new RuntimeException("CategoryOfProduct with Id [%s] doesn't exists".formatted(byId));
        }
        return byId;
    }


}
