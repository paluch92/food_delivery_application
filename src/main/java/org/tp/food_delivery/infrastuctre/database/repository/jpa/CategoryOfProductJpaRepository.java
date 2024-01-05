package org.tp.food_delivery.infrastuctre.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.infrastuctre.database.entity.CategoryOfProductEntity;

@Repository
public interface CategoryOfProductJpaRepository extends JpaRepository<CategoryOfProductEntity, Integer> {

}
