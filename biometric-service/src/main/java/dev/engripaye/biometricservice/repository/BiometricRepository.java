package dev.engripaye.biometricservice.repository;

import dev.engripaye.biometricservice.entity.BiometricData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BiometricRepository extends JpaRepository<BiometricData, Long> {

    Optional<BiometricData> findByFingerprintHarsh(String fingerprintHash);
}
