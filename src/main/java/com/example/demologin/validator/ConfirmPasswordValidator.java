package com.example.demologin.validator;

import com.example.demologin.model.DTO.PasswordForm;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ConfirmPasswordValidator implements ConstraintValidator<PasswordConfirm, PasswordForm> {
    @Override
    public boolean isValid(PasswordForm value, ConstraintValidatorContext context) {
        return value.getPassword().equals(value.getConfirmPassword());
    }
}
