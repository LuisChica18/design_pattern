package org.example.services.impl.rest;

import org.example.impl.IServiceStackAbstractFactory;
import org.example.services.IEmployeeService;
import org.example.services.IProductService;

public class RestServiceStackImpl implements IServiceStackAbstractFactory {
    @Override
    public IEmployeeService getEmployeeService() {
        return new EmployeeServiceRestImpl();
    }

    @Override
    public IProductService getProductService() {
        return new ProductServiceRestImpl();
    }
}
