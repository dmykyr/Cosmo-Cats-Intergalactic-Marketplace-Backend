package com.example.cosmocatsintergalacticmarketplacebackend.dto.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CategoryValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidCategory {
    String message() default "Invalid category. Allowed values are: PLUSH_TOYS, FOOD, TECHNOLOGY, ART";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}