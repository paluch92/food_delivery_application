package org.tp.food_delivery.buisness.dao;

import org.tp.food_delivery.domain.OrderStatus;
import org.tp.food_delivery.infrastuctre.database.entity.OrderStatusEntity;

import java.util.Optional;
import java.util.stream.Stream;

public interface OrderStatusDAO {
    Optional<OrderStatus> findById(Integer customerId);

//    Stream<OrderStatus> findOrdersInProgress();
//
//    Stream<OrderStatus> findFinishedOrders();

    Stream<OrderStatus> findAll();


    OrderStatusEntity saveOrder(OrderStatus orderStatus);

    Integer deleteOrder(Integer orderStatus);
}
