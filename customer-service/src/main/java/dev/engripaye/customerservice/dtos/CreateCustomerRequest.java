package dev.engripaye.customerservice.dtos;

import jakarta.validation.constraints.NotBlank;

public class CreateCustomerRequest {
    @NotBlank
    private String fullName;

    @NotBlank
    private String biometricHash;

    public CreateCustomerRequest() {

    }

    public String getName() {
        return fullName;
    }

    public void setName(String fullName) {
        this.fullName = fullName;
    }

    public String getBiometricHash() {
        return biometricHash;
    }

    public void setBiometricHash(String biometricHash) {
        this.biometricHash = biometricHash;
    }
}
