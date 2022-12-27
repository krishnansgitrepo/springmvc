package org.example.app.dto;

import org.example.app.validator.AgeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {

    int lower() default 18;
    int upper() default 60;

    String message() default "{invalidAgeMessage}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
