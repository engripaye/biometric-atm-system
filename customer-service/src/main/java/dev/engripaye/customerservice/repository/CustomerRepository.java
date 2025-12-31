package dev.engripaye.customerservice.repository;

import dev.engripaye.customerservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByBiometricHash(String biometricHash);
}
