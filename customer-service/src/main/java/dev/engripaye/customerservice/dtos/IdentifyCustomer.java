package dev.engripaye.customerservice.dtos;

import jakarta.validation.constraints.NotBlank;

public class IdentifyCustomer {

    @NotBlank
    private String biometricHash;

    public IdentifyCustomer(){

    }

    public String getBiometricHash() {
        return biometricHash;
    }

    public void setBiometricHash(String biometricHash) {
        this.biometricHash = biometricHash;
    }
}
