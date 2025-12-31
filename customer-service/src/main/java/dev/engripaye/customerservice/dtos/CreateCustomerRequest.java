package dev.engripaye.customerservice.dtos;

import jakarta.validation.constraints.NotBlank;

public class CreateCustomerRequest {
    @NotBlank
    private String fullName;

    @NotBlank
    private String biometricHash;

    public CreateCustomerRequest() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBiometricHash() {
        return biometricHash;
    }

    public void setBiometricHash(String biometricHash) {
        this.biometricHash = biometricHash;
    }
}
