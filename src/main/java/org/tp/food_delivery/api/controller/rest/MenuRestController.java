//package org.tp.food_delivery.api.controller.rest;
//
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.tp.food_delivery.api.dto.MenuDTO;
//import org.tp.food_delivery.buisness.MenuService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/restaurant/menu")
//@AllArgsConstructor
//public class MenuRestController {
//
//
//    private final MenuService menuService;
//
//    @GetMapping
//    public List<MenuDTO> getAllMenus() {
//        return menuService.getAllMenu();
//    }
//
//    @GetMapping("/{menuId}")
//    public ResponseEntity<MenuDTO> getMenuById(@PathVariable Integer menuId) {
//        MenuDTO menuDTO = menuService.findMenu(menuId);
//        if (menuDTO != null) {
//            return new ResponseEntity<>(menuDTO, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<MenuDTO> createMenu(@RequestBody MenuDTO menuDTO) {
//        MenuDTO createMenuDTO = menuService.createMenu(menuDTO);
//        return new ResponseEntity<>(createMenuDTO, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<MenuDTO> updateMenu(@PathVariable Integer menuId, @RequestBody MenuDTO updatedMenuDTO) {
//        MenuDTO updatedMenu = menuService.updateMenu(menuId, updatedMenuDTO);
//
//        if (updatedMenu != null) {
//            return new ResponseEntity<>(updatedMenu, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteMenu(@PathVariable Integer menuId) {
//        menuService.deleteMenu(menuId);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//}
