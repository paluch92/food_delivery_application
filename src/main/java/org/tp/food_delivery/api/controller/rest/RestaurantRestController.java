//package org.tp.food_delivery.api.controller.rest;
//
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.tp.food_delivery.api.dto.OrderDTO;
//import org.tp.food_delivery.api.dto.RestaurantDTO;
//import org.tp.food_delivery.buisness.RestaurantService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/restaurant")
//@AllArgsConstructor
//public class RestaurantRestController {
//
//    private final RestaurantService restaurantService;
//
//    @GetMapping
//    public List<RestaurantDTO> getAllRestaurant() {
//        return restaurantService.getAllRestaurants();
//    }
//
//    @GetMapping("/{restaurantId}")
//    public ResponseEntity<RestaurantDTO> getRestaurantById(@PathVariable Integer restaurantId) {
//        RestaurantDTO restaurantDTO = restaurantService.findRestaurant(restaurantId);
//        if (restaurantDTO != null) {
//            return new ResponseEntity<>(restaurantDTO, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<RestaurantDTO> createRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
//        RestaurantDTO createRestaurantDTO = restaurantService.createRestaurant(restaurantDTO);
//        return new ResponseEntity<>(createRestaurantDTO, HttpStatus.CREATED);
//    }
//
//    @PutMapping
//    public ResponseEntity<RestaurantDTO> updateRestaurant(@PathVariable Integer restaurantId, @RequestBody RestaurantDTO updatedRestaurantDTO) {
//        RestaurantDTO updatedRestaurant = restaurantService.updateRestaurant(restaurantId, updatedRestaurantDTO);
//
//        if (updatedRestaurant != null) {
//            return new ResponseEntity<>(updatedRestaurant, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping
//    public ResponseEntity<Void> deleteRestaurant(@PathVariable Integer restaurantId) {
//        restaurantService.deleteRestaurant(restaurantId);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @GetMapping("/availableOrders")
//    public OrderDTO availableOrders() {
//        return get;
//    }
//}
