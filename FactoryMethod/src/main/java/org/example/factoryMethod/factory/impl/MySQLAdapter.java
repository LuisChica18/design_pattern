package org.example.factoryMethod.factory.impl;

import org.example.factoryMethod.factory.IDBAdapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLAdapter implements IDBAdapter {

    static {
        try {
            new com.mysql.cj.jdbc.Driver();
        }catch (Exception e){}
    }
    @Override
    public Connection getConnection() {
        try {
            String urlConnection = getConnectionString();
            Connection connection =  DriverManager.getConnection(urlConnection, "root", "");
            System.out.println("Connection class => " + connection.getClass().getCanonicalName());
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getConnectionString(){
        return "jdbc:mysql://localhost:3306/design_patterns?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
    }
}
