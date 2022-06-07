package com.example.demologin.model.DTO;

import com.example.demologin.validator.PasswordConfirm;
import com.example.demologin.validator.UniqueUsername;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class SignUpForm {
    @NotEmpty
    @UniqueUsername
    @Size(min = 5, max = 12)
    private String username;
    private String password;
    private String confirmPassword;
    private String email;
    private String fullName;
    private String phoneNumber;
    private String dateOfBirth;
    private String address;

    @PasswordConfirm
    private PasswordForm passwordForm;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PasswordForm getPasswordForm() {
        return passwordForm;
    }

    public void setPasswordForm(PasswordForm passwordForm) {
        this.passwordForm = passwordForm;
    }

    public SignUpForm(String username, String password, String confirmPassword, String email, String fullName, String phoneNumber, String dateOfBirth, String address, PasswordForm passwordForm) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.email = email;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.passwordForm = passwordForm;
    }

    public SignUpForm() {
    }
}
