package com.drileida.hungerNet.service;

import com.drileida.hungerNet.dto.MenuItemDTO;
import com.drileida.hungerNet.model.MenuItem;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface MenuItemService extends CRUDService<MenuItemDTO>  {

    List<MenuItemDTO> findAll(Specification<MenuItem> spec, Pageable pageable);

    long count(Specification<MenuItem> spec);
}
