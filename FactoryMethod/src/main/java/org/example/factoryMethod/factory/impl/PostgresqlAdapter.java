package org.example.factoryMethod.factory.impl;

import org.example.factoryMethod.factory.IDBAdapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlAdapter implements IDBAdapter {

    static {
        try {
            new org.postgresql.Driver();
        }catch (Exception e){}
    }
    @Override
    public Connection getConnection() {
        try {
            String urlConnection = getConnectionString();
            Connection connection = DriverManager.getConnection(urlConnection, "postgres", "admin");
            System.out.println("Connection class => " + connection.getClass().getCanonicalName());
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getConnectionString(){
        return "jdbc:postgresql://localhost:5432/design_patterns?currentSchema=public";
    }
}
