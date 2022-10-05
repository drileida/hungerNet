package com.drileida.hungerNet.service.impl;

import com.drileida.hungerNet.dto.MenuItemDTO;
import com.drileida.hungerNet.mapper.MenuItemMapper;
import com.drileida.hungerNet.mapper.MenuMapper;
import com.drileida.hungerNet.model.Menu;
import com.drileida.hungerNet.model.MenuItem;
import com.drileida.hungerNet.repository.MenuItemRepository;
import com.drileida.hungerNet.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuItemServiceImpl implements MenuItemService {
    @Autowired
    private MenuItemRepository menuItemRepository;

    @Override
    public List<MenuItemDTO> findAll(Specification<MenuItem> spec, Pageable pageable) {

        Page<MenuItem> page = this.menuItemRepository.findAll(spec, pageable);
        return page.getContent()
                .stream()
                .map(MenuItemMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public long count(Specification<MenuItem> spec) {
        return 0;
    }

    @Override
    public MenuItemDTO save(MenuItemDTO obj) {
        MenuItem item = menuItemRepository.save(MenuItemMapper.INSTANCE.toEntity(obj));

        return MenuItemMapper.INSTANCE.toDTO(item);
    }

    @Override
    public MenuItemDTO findById(Object id) {
        return null;
    }

    @Override
    public List<MenuItemDTO> findAll() {
        return menuItemRepository.findAll()
                .stream()
                .map(MenuItemMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Object id) {

    }
}
