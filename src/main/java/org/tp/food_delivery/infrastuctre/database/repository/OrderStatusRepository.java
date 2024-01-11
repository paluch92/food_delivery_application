package org.tp.food_delivery.infrastuctre.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.buisness.dao.OrderStatusDAO;
import org.tp.food_delivery.domain.OrderStatus;
import org.tp.food_delivery.infrastuctre.database.entity.OrderStatusEntity;
import org.tp.food_delivery.infrastuctre.database.repository.jpa.OrderStatusJpaRepository;
import org.tp.food_delivery.infrastuctre.database.repository.mapper.OrderStatusEntityMapper;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
public class OrderStatusRepository implements OrderStatusDAO {

    private final OrderStatusJpaRepository orderStatusJpaRepository;
    private final OrderStatusEntityMapper orderStatusEntityMapper;

    @Override
    public Optional<OrderStatus> findById(Integer orderStatusId) {
        return orderStatusJpaRepository.findById(orderStatusId)
                .map(orderStatusEntityMapper::mapFromEntity);
    }


//    @Override
//    public Stream<OrderStatus> findOrdersInProgress() {
//        return orderStatusJpaRepository.findOrdersInProgress().stream()
//                .map(orderStatusEntityMapper::mapFromEntity);
//    }
//
//    @Override
//    public Stream<OrderStatus> findFinishedOrders() {
//        return orderStatusJpaRepository.findFinishedOrders().stream()
//                .map(orderStatusEntityMapper::mapFromEntity);
//    }

    @Override
    public Stream<OrderStatus> findAll() {
        return orderStatusJpaRepository.findAll().stream()
                .map(orderStatusEntityMapper::mapFromEntity);
    }

    @Override
    public OrderStatusEntity saveOrder(OrderStatus orderStatus) {
        OrderStatusEntity toSave = orderStatusEntityMapper.mapToEntity(orderStatus);
        OrderStatusEntity saved = orderStatusJpaRepository.save(toSave);
        return saved;
    }

    @Override
    public Integer deleteOrder(Integer orderStatus) {
        orderStatusJpaRepository.deleteById(orderStatus);
        return orderStatus;
    }


}
