package com.example.cosmocatsintergalacticmarketplacebackend.dto.product;

import com.example.cosmocatsintergalacticmarketplacebackend.dto.validation.ValidCategory;
import com.example.cosmocatsintergalacticmarketplacebackend.dto.validation.ValidRarityLevel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequest {

    @NotBlank(message = "Name is mandatory")
    @Size(max = 255, message = "Name cannot exceed 255 characters")
    private String name;

    @NotNull(message = "Price is mandatory")
    private BigDecimal price;

    @Size(max = 500, message = "Description max length is 500 characters")
    private String description;

    @NotBlank(message = "Category is mandatory")
    @ValidCategory
    private String category;

    @Size(max = 255, message = "Planet origin name max length is 255 characters")
    private String planetOrigin;

    @NotBlank(message = "Rarity level is mandatory")
    @ValidRarityLevel
    private String rarityLevel;

    private boolean isInStock;
}
