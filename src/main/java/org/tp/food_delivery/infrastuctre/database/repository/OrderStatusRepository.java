package org.tp.food_delivery.infrastuctre.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.buisness.dao.OrderStatusDAO;
import org.tp.food_delivery.domain.OrderStatus;
import org.tp.food_delivery.infrastuctre.database.entity.OrderStatusEntity;
import org.tp.food_delivery.infrastuctre.database.repository.jpa.OrderStatusJpaRepository;
import org.tp.food_delivery.infrastuctre.database.repository.mapper.OrderStatusEntityMapper;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class OrderStatusRepository implements OrderStatusDAO {

    private final OrderStatusJpaRepository orderStatusJpaRepository;
    private final OrderStatusEntityMapper orderStatusEntityMapper;

    @Override
    public Optional<List<OrderStatus>> findById(Integer orderStatusId) {
        return orderStatusJpaRepository.findById(orderStatusId)
                .map(orderStatusEntityMapper::mapFromEntity);

    }

    @Override
    public List<List<OrderStatus>> findOrdersInProgress() {
        return orderStatusJpaRepository.findOrdersInProgress().stream()
                .map(orderStatusEntityMapper::mapFromEntity)
                .toList();
    }

    @Override
    public List<List<OrderStatus>> findFinishedOrders() {
        return orderStatusJpaRepository.findFinishedOrders().stream()
                .map(orderStatusEntityMapper::mapFromEntity)
                .toList();
    }

    @Override
    public List<OrderStatus> saveOrder(OrderStatus orderStatus) {
        OrderStatusEntity toSave = orderStatusEntityMapper.mapToEntity(Collections.singletonList(orderStatus));
        OrderStatusEntity saved = orderStatusJpaRepository.save(toSave);
        return orderStatusEntityMapper.mapFromEntity(saved);
    }

    @Override
    public void deleteOrder(OrderStatus orderStatus) {
        orderStatusJpaRepository.deleteOrder(orderStatus);
    }
}
