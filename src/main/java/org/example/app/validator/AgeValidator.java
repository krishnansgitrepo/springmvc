package org.example.app.validator;

import org.example.app.dto.Age;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

    private int lower;
    private int upper;

    @Override
    public void initialize(Age constraintAnnotation) {
        this.lower = constraintAnnotation.lower();
        this.upper = constraintAnnotation.upper();
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer ageVal, ConstraintValidatorContext constraintValidatorContext) {
        if (ageVal == null || ageVal < lower || ageVal > upper) {
            return false;
        }
        return true;
    }
}
