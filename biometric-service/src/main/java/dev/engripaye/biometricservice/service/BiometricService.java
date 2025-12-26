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
                .findByFingerprintHarsh(hash)
                .orElseGet(() -> biometricRepository.save(
                        BiometricData.builder()
                                .fingerprintHash(hash)
                                .build()
                ));

        return BiometricResponse.builder()
                .biometricId(data.getId())
                .biometricHash(hash)
                .build();
    }



}
