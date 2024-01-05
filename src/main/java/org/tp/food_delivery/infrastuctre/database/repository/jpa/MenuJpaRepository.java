package org.tp.food_delivery.infrastuctre.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.domain.Menu;
import org.tp.food_delivery.infrastuctre.database.entity.MenuEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface MenuJpaRepository extends JpaRepository<MenuEntity, Integer> {
    List<MenuEntity> findAvailable();

    Optional<MenuEntity> findById(Integer menuId);

    Menu saveMenu(Menu customer);

    Menu deleteMenu(Menu customer);
}
