package org.example.impl;

import org.example.services.IEmployeeService;
import org.example.services.IProductService;

public interface IServiceStackAbstractFactory {

    public IEmployeeService getEmployeeService();

    public IProductService getProductService();
}
