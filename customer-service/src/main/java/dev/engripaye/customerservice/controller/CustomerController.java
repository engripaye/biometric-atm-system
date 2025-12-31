package dev.engripaye.customerservice.controller;

import dev.engripaye.customerservice.dtos.CreateCustomerRequest;
import dev.engripaye.customerservice.dtos.CustomerResponse;
import dev.engripaye.customerservice.dtos.IdentifyCustomerRequest;
import dev.engripaye.customerservice.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    /**
     * Admin / onboarding use-case
     */

    @PostMapping
    public CustomerResponse createCustomer(@RequestBody @Valid CreateCustomerRequest request){

        return customerService.createCustomer(request);
    }

    /**
     * Called after biometric scan
     */

    @PostMapping("/identify")
    public CustomerResponse identifyCustomer(@RequestBody @Valid IdentifyCustomerRequest request){

        return customerService.identifyCustomer(request.getBiometricHash());
    }

}
