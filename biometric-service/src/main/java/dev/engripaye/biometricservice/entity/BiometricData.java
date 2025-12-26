package dev.engripaye.biometricservice.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "biometric_data")
public class BiometricData {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true, length = 64)
    private String fingerprintHash;

    public BiometricData() {

    }

    public BiometricData(Long id, String fingerprintHash) {
        this.id = id;
        this.fingerprintHash = fingerprintHash;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFingerprintHarsh() {
        return fingerprintHash;
    }

    public void setFingerprintHarsh(String fingerprintHarsh) {
        this.fingerprintHash = fingerprintHarsh;
    }
}
