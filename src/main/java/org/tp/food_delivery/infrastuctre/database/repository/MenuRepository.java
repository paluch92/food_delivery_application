//package org.tp.food_delivery.infrastuctre.database.repository;
//
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Repository;
//import org.tp.food_delivery.buisness.dao.MenuDAO;
//import org.tp.food_delivery.domain.Menu;
//import org.tp.food_delivery.infrastuctre.database.entity.MenuEntity;
//import org.tp.food_delivery.infrastuctre.database.repository.jpa.MenuJpaRepository;
//import org.tp.food_delivery.infrastuctre.database.repository.mapper.MenuEntityMapper;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//@AllArgsConstructor
//public class MenuRepository implements MenuDAO {
//
//    private final MenuJpaRepository menuJpaRepository;
//
//    private final MenuEntityMapper menuEntityMapper;
//
//    @Override
//    public List<Menu> findAvailable() {
//        return menuJpaRepository.findAvailable().stream()
//                .map(menuEntityMapper::mapFromEntity)
//                .toList();
//    }
//
//    @Override
//    public Optional<Menu> findById(Integer menuId) {
//        return menuJpaRepository.findById(menuId)
//                .map(menuEntityMapper::mapFromEntity);
//    }
//
//    @Override
//    public Menu saveMenu(Menu menu) {
//        MenuEntity toSave = menuEntityMapper.mapToEntity(menu);
//        MenuEntity saved = menuJpaRepository.save(toSave);
//        return menuEntityMapper.mapFromEntity(saved);
//    }
//
//    @Override
//    public Menu deleteMenu(Menu menu) {
//        return menuJpaRepository.deleteMenu(menu);
//    }
//
//}
