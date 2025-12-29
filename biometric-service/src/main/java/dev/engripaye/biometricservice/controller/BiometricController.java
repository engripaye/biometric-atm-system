package dev.engripaye.biometricservice.controller;

import dev.engripaye.biometricservice.dtos.BiometricRequest;
import dev.engripaye.biometricservice.dtos.BiometricResponse;
import dev.engripaye.biometricservice.service.BiometricService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biometric")
public class BiometricController {

    private final BiometricService biometricService;


    public BiometricController(BiometricService biometricService) {

        this.biometricService = biometricService;
    }

    /*
     * Simulates fingerprint scan from ATM
     */

    @PostMapping("/scan")
    public BiometricResponse scanFingerprint(@RequestBody @Valid BiometricRequest request) {
        return biometricService.processFingerprint(request.getFingerprint());
    }

    @GetMapping
    public List<BiometricResponse> getAllBiometrics(){
        return biometricService.getAllBiometrics();
    }

}
