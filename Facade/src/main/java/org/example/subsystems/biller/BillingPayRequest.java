package org.example.subsystems.biller;

public class BillingPayRequest {

    private Long customerId;
    private double amount;

    public BillingPayRequest(Long customerId, double amount) {
        this.customerId = customerId;
        this.amount = amount;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
