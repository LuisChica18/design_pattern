package org.example.subsystems.crm;

import org.example.util.Customer;
import org.example.util.OnMemoryDataBase;

public class CRMSystem {

    public Customer findCustomer(Long customerId){
        return OnMemoryDataBase.findCustomerById(customerId);
    }
}
