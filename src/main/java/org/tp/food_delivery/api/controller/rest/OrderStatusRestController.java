//package org.tp.food_delivery.api.controller.rest;
//
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.tp.food_delivery.api.dto.OrderStatusDTO;
//import org.tp.food_delivery.buisness.OrderStatusService;
//import org.tp.food_delivery.domain.OrderStatus;
//import org.tp.food_delivery.domain.OrderStatusType;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/orderStatus")
//@AllArgsConstructor
//public class OrderStatusRestController {
//
//
//    private final OrderStatusService orderStatusService;
//
//    @GetMapping
//    public List<OrderStatus> getAllOrderStatus() {
//        return orderStatusService.findAll().collect(Collectors.toList());
//    }
//
//    @GetMapping("/{orderStatusId}")
//    public OrderStatusDTO getOrderStatusById(@PathVariable Integer orderStatusId) {
//        OrderStatusDTO orderStatusDTO = orderStatusService.findById(orderStatusId);
//        if (orderStatusDTO != null) {
//            return new ResponseEntity<>(orderStatusDTO, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<OrderStatusDTO> createOrderStatus(@RequestBody OrderStatusDTO orderStatusDTO) {
//        if (orderStatusDTO.getOrderStatus() == null) {
//            orderStatusDTO.setOrderStatus(OrderStatusType.IN_PROGRESS.toString());
//        }
//
//        OrderStatusDTO createdOrderStatusDTO = orderStatusService.createOrderStatus(orderStatusDTO);
//        return new ResponseEntity<>(createdOrderStatusDTO, HttpStatus.CREATED);
//    }
//
//
//    @PutMapping("/{id}")
//    public ResponseEntity<OrderStatusDTO> updateOrderStatus(@PathVariable Integer orderStatusId, @RequestBody OrderStatusDTO updatedOrderStatusDTO) {
//        OrderStatusDTO updatedOrderStatus = orderStatusService.updateOrderStatus(orderStatusId, updatedOrderStatusDTO);
//
//        if (updatedOrderStatus != null) {
//            return new ResponseEntity<>(updatedOrderStatus, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteOrderStatus(@PathVariable Integer orderStatusId) {
//        orderStatusService.deleteOrderStatus(orderStatusId);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//}
