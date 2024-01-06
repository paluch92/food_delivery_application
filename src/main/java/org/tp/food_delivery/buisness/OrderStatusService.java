package org.tp.food_delivery.buisness;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tp.food_delivery.api.dto.OrderStatusDTO;
import org.tp.food_delivery.infrastuctre.database.entity.OrderStatusEntity;
import org.tp.food_delivery.infrastuctre.database.repository.jpa.OrderStatusJpaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderStatusService {

    private final OrderStatusJpaRepository orderStatusJpaRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public OrderStatusDTO createOrderStatus(OrderStatusDTO orderStatusDTO) {
        OrderStatusEntity orderStatus = convertToEntity(orderStatusDTO);
        OrderStatusEntity createdOrderStatus = orderStatusJpaRepository.save(orderStatus);
        return convertToDto(createdOrderStatus);
    }

    public List<OrderStatusDTO> getAllOrderStatus() {
        List<OrderStatusEntity> orderStatusEntity = orderStatusJpaRepository.findAll();
        return orderStatusEntity.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private OrderStatusDTO convertToDto(OrderStatusEntity orderStatusEntity) {
        return modelMapper.map(orderStatusEntity, OrderStatusDTO.class);
    }

    private OrderStatusEntity convertToEntity(OrderStatusDTO orderStatusDTO) {
        return modelMapper.map(orderStatusDTO, OrderStatusEntity.class);
    }

    @Transactional
    void deleteOrderStatus(OrderStatusEntity orderStatusId) {
        orderStatusJpaRepository.delete(orderStatusId);
    }

    @Transactional
    public OrderStatusDTO findOrderStatus(Integer orderStatusId) {
        OrderStatusEntity orderStatusEntity = orderStatusJpaRepository.findById(orderStatusId).orElse(null);
        return (orderStatusEntity != null ? convertToDto(orderStatusEntity) : null);
    }
}

