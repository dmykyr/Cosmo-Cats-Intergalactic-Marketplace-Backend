package com.example.cosmocatsintergalacticmarketplacebackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {
    private UUID id;
    private String name;
    private String description;
}
