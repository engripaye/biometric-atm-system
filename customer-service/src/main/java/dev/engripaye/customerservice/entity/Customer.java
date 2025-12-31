package dev.engripaye.customerservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false, unique = true, length = 64)
    private String biometricHash;

    protected Customer() {

    }
    public Customer(Long id, String fullName, String biometricHash) {
        this.id = id;
        this.fullName = fullName;
        this.biometricHash = biometricHash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    // ENGR. IPAYE BABATUNDE 2026 OFFICIAL PROJECT
}
