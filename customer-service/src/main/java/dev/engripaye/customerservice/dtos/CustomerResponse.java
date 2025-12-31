package dev.engripaye.customerservice.dtos;

public class CustomerResponse {

    private Long customerId;
    private String fullName;

    /**
     * Constructor used internally by Builder
     */
    private CustomerResponse(Builder builder) {
        this.customerId = builder.customerId;
        this.fullName = builder.fullName;
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

      /* ==========================
       BUILDER IMPLEMENTATION
       ========================== */

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Long customerId;
        private String fullName;

        private Builder() {
        }

        public Builder customerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public CustomerResponse build() {
            return new CustomerResponse(this);
        }
    }

}
