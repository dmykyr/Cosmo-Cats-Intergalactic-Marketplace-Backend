package com.example.cosmocatsintergalacticmarketplacebackend.dto.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = RarityLevelValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidRarityLevel {
    String message() default "Invalid rarity level. Allowed values are: COMMON, RARE, LEGENDARY";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
