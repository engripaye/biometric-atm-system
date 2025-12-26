package dev.engripaye.biometricservice.service;

import dev.engripaye.biometricservice.dtos.BiometricResponse;
import dev.engripaye.biometricservice.entity.BiometricData;
import dev.engripaye.biometricservice.repository.BiometricRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

@Service
public class BiometricService {

    private final BiometricRepository biometricRepository;


    public BiometricService(BiometricRepository biometricRepository) {
        this.biometricRepository = biometricRepository;
    }

    public BiometricResponse processFingerprint(String rawFingerprint){

        // hash fingerprint
        String hash = DigestUtils.sha256Hex(rawFingerprint);

        // check if fingerprint already exist
        BiometricData data = biometricRepository
                .findByFingerprintHash(hash)
                .orElseGet(() -> biometricRepository.save(
                        new BiometricData(hash)
                ));

        return new BiometricResponse(
                data.getId(),
                data.getFingerprintHarsh()
        );
    }



}
