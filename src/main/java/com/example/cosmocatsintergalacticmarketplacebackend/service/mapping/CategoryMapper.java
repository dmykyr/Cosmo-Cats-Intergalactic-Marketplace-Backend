package com.example.cosmocatsintergalacticmarketplacebackend.service.mapping;

import com.example.cosmocatsintergalacticmarketplacebackend.dto.CategoryRequest;
import com.example.cosmocatsintergalacticmarketplacebackend.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryRequest toDTO(Category category);

    Category toEntity(CategoryRequest categoryDTO);
}
