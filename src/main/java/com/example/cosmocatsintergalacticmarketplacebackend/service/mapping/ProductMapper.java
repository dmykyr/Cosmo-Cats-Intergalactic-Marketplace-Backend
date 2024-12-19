package com.example.cosmocatsintergalacticmarketplacebackend.service.mapping;

import com.example.cosmocatsintergalacticmarketplacebackend.domain.Product;
import com.example.cosmocatsintergalacticmarketplacebackend.domain.enums.Category;
import com.example.cosmocatsintergalacticmarketplacebackend.domain.enums.RarityLevel;
import com.example.cosmocatsintergalacticmarketplacebackend.dto.product.ProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "id", expression = "java(UUID.randomUUID())")
    @Mapping(target = "category", source = "category", qualifiedByName = "mapCategory")
    @Mapping(target = "rarityLevel", source = "rarityLevel", qualifiedByName = "mapRarityLevel")
    Product toProduct(ProductRequest productRequest);

    @Named("mapCategory")
    default Category mapCategory(String category) {
        return Category.valueOf(category.toUpperCase());
    }

    @Named("mapRarityLevel")
    default RarityLevel mapRarityLevel(String rarityLevel) {
        return RarityLevel.valueOf(rarityLevel.toUpperCase());
    }
}