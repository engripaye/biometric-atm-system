package dev.engripaye.biometricservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "biometric_data")
public class BiometricData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 64)
    private String fingerprintHash;

    // Required by JPA
    protected BiometricData() {
    }

    // ✅ THIS is the constructor your service needs
    public BiometricData(String fingerprintHash) {
        this.fingerprintHash = fingerprintHash;
    }

    public Long getId() {
        return id;
    }

    public String getFingerprintHash() {
        return fingerprintHash;
    }
}
