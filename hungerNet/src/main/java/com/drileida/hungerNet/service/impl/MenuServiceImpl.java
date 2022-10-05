package com.drileida.hungerNet.service.impl;

import com.drileida.hungerNet.dto.MenuDTO;
import com.drileida.hungerNet.mapper.MenuMapper;
import com.drileida.hungerNet.model.Menu;
import com.drileida.hungerNet.repository.MenuRepository;
import com.drileida.hungerNet.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;


    @Override
    public List<MenuDTO> findAllByStatusTrue() {
        return null;
    }

    @Override
    public List<MenuDTO> findAll(Specification<Menu> spec, Pageable pageable) {

        Page<Menu> page = this.menuRepository.findAll(spec, pageable);
        return page.getContent()
                .stream()
                .map(MenuMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public long count(Specification<Menu> spec) {
        return menuRepository.count(spec);
    }

    @Override
    public MenuDTO save(MenuDTO obj) {
        Menu menu = menuRepository.save(MenuMapper.INSTANCE.toEntity(obj));
        return MenuMapper.INSTANCE.toDTO(menu);
    }

    @Override
    public MenuDTO findById(Object id) {
        return menuRepository.findById((Long) id)
                .map(MenuMapper.INSTANCE::toDTO)
                .orElse(null);
    }

    @Override
    public List<MenuDTO> findAll() {
        return menuRepository.findAll()
                .stream()
                .map(MenuMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Object id) {
        menuRepository.deleteById((Long) id);

    }
}
