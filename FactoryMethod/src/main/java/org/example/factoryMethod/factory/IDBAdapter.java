package org.example.factoryMethod.factory;

import java.sql.Connection;

public interface IDBAdapter {

    public Connection getConnection();
}
