package dev.engripaye.customerservice.service;

import dev.engripaye.customerservice.dtos.CreateCustomerRequest;
import dev.engripaye.customerservice.dtos.CustomerResponse;
import dev.engripaye.customerservice.entity.Customer;
import dev.engripaye.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.concurrent.CyclicBarrier;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerResponse createCustomer(CreateCustomerRequest request){

        Customer customer = Customer.builder()
                .fullName(request.getFullName())
                .biometricHash(request.getBiometricHash())
                .build();

        Customer saved = customerRepository.save(customer);

        return CustomerResponse.builder()
                .customerId(saved.getId())
                .fullName(saved.getFullName())
                .build();


    }

    public CustomerResponse identifyCustomer(String biometricHash){

        Customer customer = customerRepository.findByBiometricHash(biometricHash)
                .orElseThrow(() -> new RuntimeException("Customer Not found"));

        return CustomerResponse.builder()
                .customerId(customer.getId())
                .fullName(customer.getFullName())
                .build();
    }
}
