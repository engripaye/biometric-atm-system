package dev.engripaye.customerservice.dtos;

public class CustomerResponse {

    private Long customerId;
    private String fullName;

    public CustomerResponse(Long customerId, String fullName) {
        this.customerId = customerId;
        this.fullName = fullName;
    }

    public CustomerResponse(){

    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
