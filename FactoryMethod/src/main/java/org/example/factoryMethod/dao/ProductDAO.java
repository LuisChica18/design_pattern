package org.example.factoryMethod.dao;

import org.example.factoryMethod.entity.Product;
import org.example.factoryMethod.enums.DBType;
import org.example.factoryMethod.factory.DBAdapterFactory;
import org.example.factoryMethod.factory.IDBAdapter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private IDBAdapter adapter;

    public ProductDAO(DBType type){
        adapter = DBAdapterFactory.getAdapter(type);
    }

    public ProductDAO(){
        adapter = DBAdapterFactory.getAdapter();
    }

    public void saveProduct(Product product){
        String sql = "INSERT INTO products VALUES (?, ?, ?)";
        try {
            Connection connection = adapter.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, product.getId());
            statement.setString(2, product.getName());
            statement.setDouble(3, product.getPrice());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Product> listAllProduct(){
        List<Product> products = new ArrayList<Product>();
        String sql = "SELECT * FROM products";
        try {
            Connection connection = adapter.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()){
                Product current = new Product(result.getLong(1), result.getString(2), result.getDouble(3));
                products.add(current);
            }
            return products;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
