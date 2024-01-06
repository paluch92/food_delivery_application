package org.tp.food_delivery.buisness;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tp.food_delivery.api.dto.MenuDTO;
import org.tp.food_delivery.infrastuctre.database.entity.MenuEntity;
import org.tp.food_delivery.infrastuctre.database.repository.jpa.MenuJpaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MenuService {

    private final MenuJpaRepository menuJpaRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public MenuDTO createMenu(MenuDTO menuDTO) {
        MenuEntity menu = convertToEntity(menuDTO);
        MenuEntity createdMenu = menuJpaRepository.save(menu);
        return convertToDto(createdMenu);

    }

    public List<MenuDTO> getAllMenu() {
        List<MenuEntity> menuEntity = menuJpaRepository.findAll();
        return menuEntity.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private MenuDTO convertToDto(MenuEntity menuEntity) {
        return modelMapper.map(menuEntity, MenuDTO.class);
    }

    private MenuEntity convertToEntity(MenuDTO menuDTO) {
        return modelMapper.map(menuDTO, MenuEntity.class);
    }

    @Transactional
    void deleteMenu(MenuEntity menuId) {
        menuJpaRepository.delete(menuId);
    }

    @Transactional
    public MenuDTO findMenu(Integer menuId) {
        MenuEntity menuEntity = menuJpaRepository.findById(menuId).orElse(null);
        return (menuEntity != null ? convertToDto(menuEntity) : null);
    }
}
