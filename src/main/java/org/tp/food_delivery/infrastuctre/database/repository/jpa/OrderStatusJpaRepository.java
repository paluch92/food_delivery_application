package org.tp.food_delivery.infrastuctre.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.infrastuctre.database.entity.OrderStatusEntity;

@Repository
public interface OrderStatusJpaRepository extends JpaRepository<OrderStatusEntity, Integer> {

//    @Query("""
//            "SELECT os FROM OrderStatusEntity os WHERE os.status = 'IN_PROGRESS'"
//             """)
//    List<OrderStatusEntity> findOrdersInProgress();
//
//    @Query("""
//            "SELECT os FROM OrderStatusEntity os WHERE os.status = 'COMPLETED'"
//              """)
//    List<OrderStatusEntity> findFinishedOrders();


//    List<OrderStatus> findOrdersInProgressByStatus(OrderStatusType inProgress);
}
