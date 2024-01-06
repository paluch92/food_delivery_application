package org.tp.food_delivery.infrastuctre.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.infrastuctre.database.entity.OrderStatusEntity;

@Repository
public interface OrderStatusJpaRepository extends JpaRepository<OrderStatusEntity, Integer> {

}
