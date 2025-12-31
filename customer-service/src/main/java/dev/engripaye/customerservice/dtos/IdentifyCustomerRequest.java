package dev.engripaye.customerservice.dtos;

import jakarta.validation.constraints.NotBlank;

public class IdentifyCustomerRequest {

    @NotBlank
    private String biometricHash;

    public IdentifyCustomerRequest(){

    }

    public String getBiometricHash() {
        return biometricHash;
    }

    public void setBiometricHash(String biometricHash) {
        this.biometricHash = biometricHash;
    }
}
