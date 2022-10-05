package com.drileida.hungerNet.mapper;

import com.drileida.hungerNet.dto.MenuItemDTO;
import com.drileida.hungerNet.model.MenuItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface MenuItemMapper {
    MenuItemMapper INSTANCE = Mappers.getMapper(MenuItemMapper.class);

    MenuItem toEntity(MenuItemDTO dto);

    MenuItemDTO toDTO(MenuItem entity);
}
