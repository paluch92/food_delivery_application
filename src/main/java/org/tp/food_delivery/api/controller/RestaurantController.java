package org.tp.food_delivery.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.tp.food_delivery.api.dto.AddressDTO;
import org.tp.food_delivery.api.dto.RestaurantDTO;
import org.tp.food_delivery.api.dto.mapper.MenuMapper;
import org.tp.food_delivery.api.dto.mapper.RestaurantMapper;
import org.tp.food_delivery.buisness.RestaurantService;
import org.tp.food_delivery.domain.Restaurant;

@Controller
@AllArgsConstructor
public class RestaurantController {

    private static final String RESTAURANT = "/restaurants";
    private static final String RESTAURANT_BY_ID = "/restaurants/{restaurantId}";

    private final RestaurantService restaurantService;
    private final RestaurantMapper restaurantMapper;
    private final MenuMapper menuMapper;

    @GetMapping(value = RESTAURANT)
    public String restaurants(Model model) {
        var allRestaurants = restaurantService.findAll().stream()
                .map(restaurantMapper::map)
                .toList();
        model.addAttribute("restaurants", allRestaurants);
        return "restaurants";
    }

    @GetMapping(value = RESTAURANT_BY_ID)
    public String restaurantById(@PathVariable Integer restaurantId, Model model) {
        RestaurantDTO restaurant = restaurantService.findById(restaurantId).map(restaurantMapper::map)
                .orElseThrow(() -> new RuntimeException("Restaurant with Id [%s] doesn't exists".formatted(restaurantId)));

        var menu = restaurantService.findById(restaurantId).map(Restaurant::getMenu)
                .map(menuMapper::map)
                .orElseThrow(() -> new RuntimeException("Menu in Restaurant with Id [%s] doesn't exists".formatted(restaurantId)));
        AddressDTO address = restaurant.getAddress();


        model.addAttribute("restaurant", restaurant);
        model.addAttribute("address", address);
        model.addAttribute("menu", menu);
        return "restaurantDetails";
    }
}

//
// c1_0.customer_id,a1_0.address_id,a1_0.city,a1_0.country,a1_0.postal_code,a1_0.street,c1_0.email,c1_0.name,o1_0.order_status_id,
// o1_0.customer_id,o1_0.date_of_order,o1_0.order_status,o1_0.product_name,o1_0.quantity_of_product,r1_0.restaurant_id,a2_0.address_id,a2_0.city,a2_0.country,a2_0.postal_code,a2_0.street,r1_0.available_streets,r1_0.email,m1_0.menu_id,c2_0.category_of_product_id,c2_0.category_name,m1_0.price,m1_0.product_name,r1_0.phone,r1_0.restaurant_name,c1_0.phone,c1_0.surname from customer c1_0 left join address a1_0 on a1_0.address_id=c1_0.address_id left join order_status o1_0 on o1_0.order_status_id=c1_0.order_status_order_status_id left join restaurant r1_0 on r1_0.restaurant_id=o1_0.restaurant_id left join address a2_0 on a2_0.address_id=r1_0.address_id left join menu m1_0 on m1_0.menu_id=r1_0.menu_id left join category_of_product c2_0 on c2_0.category_of_product_id=m1_0.category_of_product_id where c1_0.address_id=?]; SQL [n/a]]
