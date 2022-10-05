package com.drileida.hungerNet.service;

import com.drileida.hungerNet.dto.MenuDTO;
import com.drileida.hungerNet.model.Menu;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface MenuService extends CRUDService<MenuDTO> {

    List<MenuDTO> findAllByStatusTrue();

    List<MenuDTO> findAll(Specification<Menu> spec, Pageable pageable);

    long count(Specification<Menu> spec);
}
