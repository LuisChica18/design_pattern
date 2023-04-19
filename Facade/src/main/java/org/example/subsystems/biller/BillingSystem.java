package org.example.subsystems.biller;

import org.example.util.Customer;
import org.example.util.OnMemoryDataBase;

public class BillingSystem {

    public double queryCustomerBalance(Long customerId) {
        Customer customer = OnMemoryDataBase.findCustomerById(customerId);
        return customer.getBalance();
    }

    public double pay(BillingPayRequest billingPay) {
        Customer customer = OnMemoryDataBase.findCustomerById(billingPay.getCustomerId());
        customer.setBalance(customer.getBalance() - billingPay.getAmount());
        System.out.println("Payment applied to the client '"+customer.getName()+"', "
                + "the new balance is '"+customer.getBalance()+"'");
        return customer.getBalance();//new Balance.
    }

}
