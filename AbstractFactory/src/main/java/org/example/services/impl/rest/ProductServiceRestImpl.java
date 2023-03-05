package org.example.services.impl.rest;

import org.example.services.IProductService;

public class ProductServiceRestImpl implements IProductService {
    @Override
    public String[] getProducts() {
        System.out.println("ProductServiceRestImpl.getProducts");
        return new String[]{"Product1", "Product2"};
    }
}
