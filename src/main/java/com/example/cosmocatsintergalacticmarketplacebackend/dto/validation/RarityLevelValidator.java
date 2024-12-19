package com.example.cosmocatsintergalacticmarketplacebackend.dto.validation;

import com.example.cosmocatsintergalacticmarketplacebackend.domain.enums.RarityLevel;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RarityLevelValidator implements ConstraintValidator<ValidRarityLevel, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }

        try {
            RarityLevel.valueOf(value);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}