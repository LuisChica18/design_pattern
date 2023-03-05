package org.example.services.impl.ws;

import org.example.impl.IServiceStackAbstractFactory;
import org.example.services.IEmployeeService;
import org.example.services.IProductService;
import org.example.services.impl.rest.EmployeeServiceRestImpl;
import org.example.services.impl.rest.ProductServiceRestImpl;

public class WSServiceStackImpl implements IServiceStackAbstractFactory {
    @Override
    public IEmployeeService getEmployeeService() {
        return new EmployeeServiceWSImpl();
    }

    @Override
    public IProductService getProductService() {
        return new ProductServiceWSImpl();
    }
}
