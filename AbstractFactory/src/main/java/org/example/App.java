package org.example;

import org.example.impl.IServiceStackAbstractFactory;
import org.example.impl.ServiceStackAbstractFactory;
import org.example.impl.ServiceType;
import org.example.services.IEmployeeService;
import org.example.services.IProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Change factory from properties
        //IServiceStackAbstractFactory factory = ServiceStackAbstractFactory.createServiceFactory(ServiceType.SOAP);
        IServiceStackAbstractFactory factory = ServiceStackAbstractFactory.createServiceFactory();

        IProductService productService = factory.getProductService();
        IEmployeeService employeeService = factory.getEmployeeService();

        String[] employees = employeeService.getEmployees();
        for (String current: employees) {
            System.out.println(current);
        }

        String[] products = productService.getProducts();
        for (String current: products) {
            System.out.println(current);
        }
    }
}
