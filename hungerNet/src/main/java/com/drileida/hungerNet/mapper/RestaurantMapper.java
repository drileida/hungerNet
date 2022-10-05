package com.drileida.hungerNet.mapper;

import com.drileida.hungerNet.dto.RestaurantDTO;
import com.drileida.hungerNet.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {
    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant toEntity(RestaurantDTO dto);

    RestaurantDTO toDTO(Restaurant entity);
}
