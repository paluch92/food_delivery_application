package org.tp.food_delivery.buisness;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tp.food_delivery.buisness.dao.MenuDAO;
import org.tp.food_delivery.domain.Menu;
import org.tp.food_delivery.domain.exception.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MenuService {

    private final MenuDAO menuDAO;

    @Transactional
    public void saveMenu(Menu menu) {
        menuDAO.saveMenu(menu);
    }

    public List<Menu> findAll() {
        return menuDAO.findAvailable();
    }


    public Menu findById(Integer menuId) {
        Optional<Menu> menu = menuDAO.findById(menuId);
        if (menu.isEmpty()) {
            throw new NotFoundException("Could not find menu by Id: [%s]".formatted(menuId));
        }
        return menu.get();
    }

}

