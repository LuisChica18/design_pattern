package org.example;

import org.example.factoryMethod.dao.ProductDAO;
import org.example.factoryMethod.entity.Product;
import org.example.factoryMethod.enums.DBType;
import org.example.factoryMethod.factory.DBAdapterFactory;
import org.example.factoryMethod.factory.IDBAdapter;
import org.example.factoryMethod.factory.impl.MySQLAdapter;
import org.example.factoryMethod.factory.impl.PostgresqlAdapter;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Llamadas directas al implementador
        //MySQLAdapter adapter = new MySQLAdapter();
        //PostgresqlAdapter adapter = new PostgresqlAdapter();

        // Llamada al interfaz - Patron de diseño Factory
        //IDBAdapter adapter = DBAdapterFactory.getAdapter(DBType.MYSQL);
        //Connection connection = adapter.getConnection();

        // Factory set databases from parameter
        //ProductDAO productDAO = new ProductDAO(DBType.MYSQL);

        // Change Factory to load properties
        ProductDAO productDAO = new ProductDAO();
        Product product = new Product(2l, "producto 2", 47.35);
        // Save products
        //productDAO.saveProduct(product);


        // List products
        productDAO.listAllProduct().forEach(System.out::println);
        System.out.println( "Hello World!" );
    }
}
