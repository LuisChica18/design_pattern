package org.example.services.impl.rest;

import org.example.services.IEmployeeService;

public class EmployeeServiceRestImpl implements IEmployeeService {
    @Override
    public String[] getEmployees() {
        System.out.println("EmployeeServiceRestImpl.getEmployees");
        return new String[]{"Employee1", "Employee2"};
    }
}
