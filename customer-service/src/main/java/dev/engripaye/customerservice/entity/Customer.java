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
    /**
     * Private constructor used ONLY by the Builder
     */
    private Customer(Builder builder) {
        this.id = builder.id;
        this.fullName = builder.fullName;
        this.biometricHash = builder.biometricHash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Long id;
        private String fullName;
        private String biometricHash;

        private Builder() {
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder biometricHash(String biometricHash) {
            this.biometricHash = biometricHash;
            return this;
        }

        public Customer build() {
            // Basic validation (optional but recommended)
            if (fullName == null || fullName.isBlank()) {
                throw new IllegalStateException("fullName must not be null or empty");
            }
            if (biometricHash == null || biometricHash.isBlank()) {
                throw new IllegalStateException("biometricHash must not be null or empty");
            }
            return new Customer(this);
        }
    }

    // ENGR. IPAYE BABATUNDE 2026 OFFICIAL PROJECT
}
