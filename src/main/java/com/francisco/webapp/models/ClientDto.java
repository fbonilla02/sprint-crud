package com.francisco.webapp.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class ClientDto {
    @NotEmpty(message = "el nombre es requerido")
    private String firstName;

    @NotEmpty(message = "el apellido es requerido")
    private String lastName;

    @NotEmpty(message = "el email es requerido")
    @Email
    private String email;

    private String phone;
    private String address;

    @NotEmpty(message = "el status es requerido")
    private String status;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
