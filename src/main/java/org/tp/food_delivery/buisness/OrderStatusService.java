package org.tp.food_delivery.buisness;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tp.food_delivery.buisness.dao.OrderStatusDAO;
import org.tp.food_delivery.domain.OrderStatus;
import org.tp.food_delivery.domain.exception.NotFoundException;

import java.util.Optional;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class OrderStatusService {

    private final OrderStatusDAO orderStatusDAO;
//    private OrderStatusJpaRepository orderStatusJpaRepository;
//    private OrderStatusEntityMapper orderStatusEntityMapper;

    @Transactional
    public void saveOrderStatus(OrderStatus orderStatus) {
        orderStatusDAO.saveOrder(orderStatus);
    }

    public Stream<OrderStatus> findAll() {
        return orderStatusDAO.findAll();
    }


    @Transactional
    public void deleteOrderStatus(Integer orderStatusId) {
        orderStatusDAO.deleteOrder(orderStatusId);
    }

    public OrderStatus findById(Integer orderStatusId) {
        Optional<OrderStatus> orderStatus = orderStatusDAO.findById(orderStatusId);
        if (orderStatus.isEmpty()) {
            throw new NotFoundException("Could not find orderStatus by Id: [%s]".formatted(orderStatusId));
        }
        return orderStatus.get();
    }

//    public List<List<OrderStatus>> findOrdersInProgress() {
//        return orderStatusJpaRepository.findOrdersInProgress().stream()
//                .map(orderStatusEntityMapper::mapFromEntity)
//                .toList();
//    }
//
//
//        public List<OrderStatus> findOrdersInProgress(OrderStatusType inProgress) {
//            return orderStatusJpaRepository.findOrdersInProgressByStatus(OrderStatusType.IN_PROGRESS).stream()
//                    .map(orderStatusEntityMapper::mapFromEntity)
//                    .toList();
//        }
//
//    public List<List<OrderStatus>> findFinishedOrders() {
//        return orderStatusJpaRepository.findOrdersInProgress().stream()
//                .map(orderStatusEntityMapper::mapFromEntity)
//                .toList();
//    }

//    public OrderStatusDAO updateOrderStatus(Integer orderStatusId, OrderStatusDTO updatedOrderStatus) {
//        OrderStatusEntity existingOrderStatus = (OrderStatusEntity) orderStatusDAO.findById(orderStatusId).orElseThrow(null);
//        if (existingOrderStatus != null) {
//            orderStatusDAO.findOrdersInProgress.;
//            orderStatusJpaRepository.save(existingOrderStatus);
//            return (existingOrderStatus);
//        }
//
//        return null;
//    }
}

