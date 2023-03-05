package org.example.services.impl.ws;

import org.example.services.IProductService;

public class ProductServiceWSImpl implements IProductService {
    @Override
    public String[] getProducts() {
        System.out.println("ProductServiceWSImpl.getProducts");
        return new String[]{"Product1", "Product2"};
    }
}
