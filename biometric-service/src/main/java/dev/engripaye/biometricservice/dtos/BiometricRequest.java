package dev.engripaye.biometricservice.dtos;

import jakarta.validation.constraints.NotBlank;

public class BiometricRequest {

    @NotBlank
    private String fingerprint;

    public BiometricRequest(){

    }
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }
}
