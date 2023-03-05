package org.example.services.impl.ws;

import org.example.services.IEmployeeService;

public class EmployeeServiceWSImpl implements IEmployeeService {
    @Override
    public String[] getEmployees() {
        System.out.println("EmployeeServiceWSImpl.getEmployees");
        return new String[]{"Employee1", "Employee2"};
    }
}
