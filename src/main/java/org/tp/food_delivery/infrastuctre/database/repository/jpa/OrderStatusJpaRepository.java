package org.tp.food_delivery.infrastuctre.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.domain.OrderStatus;
import org.tp.food_delivery.infrastuctre.database.entity.OrderStatusEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderStatusJpaRepository extends JpaRepository<OrderStatusEntity, Integer> {
    Optional<OrderStatusEntity> findById(Integer orderId);

    List<OrderStatusEntity> findOrdersInProgress();

    List<OrderStatusEntity> findFinishedOrders();

    OrderStatus saveOrder(OrderStatus orderStatus);

    void deleteOrder(OrderStatus orderStatus);
}
