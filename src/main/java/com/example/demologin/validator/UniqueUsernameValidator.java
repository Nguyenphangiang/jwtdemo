package com.example.demologin.validator;

import com.example.demologin.model.AppUser;
import com.example.demologin.repo.IUserRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        AppUser appUser = userRepository.findByUsername(value);
        if (appUser != null) {
            return false;
        }
        return true;
    }
}
