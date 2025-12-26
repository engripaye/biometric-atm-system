package dev.engripaye.biometricservice.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "biometric_data")
public class BiometricData {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true, length = 64)
    private String fingerprintHarsh;

    public BiometricData() {

    }

    public BiometricData(Long id, String fingerprintHarsh) {
        this.id = id;
        this.fingerprintHarsh = fingerprintHarsh;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFingerprintHarsh() {
        return fingerprintHarsh;
    }

    public void setFingerprintHarsh(String fingerprintHarsh) {
        this.fingerprintHarsh = fingerprintHarsh;
    }
}
