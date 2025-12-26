package dev.engripaye.biometricservice.dtos;

public class BiometricResponse {

    private Long biometricId;
    private String biometricHash;

    public BiometricResponse(Long biometricId, String biometricHash) {
        this.biometricId = biometricId;
        this.biometricHash = biometricHash;
    }

    public BiometricResponse(){

    }

    public Long getBiometricId() {
        return biometricId;
    }

    public void setBiometricId(Long biometricId) {
        this.biometricId = biometricId;
    }

    public String getBiometricHash() {
        return biometricHash;
    }

    public void setBiometricHash(String biometricHash) {
        this.biometricHash = biometricHash;
    }
}
