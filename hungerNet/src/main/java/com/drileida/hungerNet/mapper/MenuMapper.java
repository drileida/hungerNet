package com.drileida.hungerNet.mapper;

import com.drileida.hungerNet.dto.MenuDTO;
import com.drileida.hungerNet.model.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MenuMapper {
    MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);

    Menu toEntity(MenuDTO dto);

    MenuDTO toDTO(Menu entity);
}
