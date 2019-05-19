package com.geekbrains.filestorage.validation;

import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {
    private String firstFieldName;
    private String seconFieldName;
    private String message;

    @Override
    public void initialize(final FieldMatch constraintAnnotation) {
        firstFieldName = constraintAnnotation.first();
        seconFieldName = constraintAnnotation.second();
        message = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(final Object value, final ConstraintValidatorContext context) {
        boolean valid = true;
        try {
            final Object firstObject = new BeanWrapperImpl(value).getPropertyValue(firstFieldName);
            final Object secondObject = new BeanWrapperImpl(value).getPropertyValue(seconFieldName);
            valid = firstObject == null && secondObject == null || firstObject != null && firstObject.equals(secondObject);
        } catch (final Exception ignore) {

        }

        if(!valid) {
            context
                    .buildConstraintViolationWithTemplate(message)
                    .addPropertyNode(firstFieldName)
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
        }
        return valid;
    }
}
