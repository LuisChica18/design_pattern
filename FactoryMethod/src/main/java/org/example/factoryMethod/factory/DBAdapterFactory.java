package org.example.factoryMethod.factory;

import org.example.factoryMethod.enums.DBType;
import org.example.factoryMethod.factory.impl.MySQLAdapter;
import org.example.factoryMethod.factory.impl.PostgresqlAdapter;

import java.io.InputStream;
import java.util.Properties;

public class DBAdapterFactory {

    public static final String DB_TYPE = "dbadaptertype";

    public static IDBAdapter getAdapter(DBType type){
        switch (type){
            case MYSQL:
                return new MySQLAdapter();
            case POSTGRESQL:
                return new PostgresqlAdapter();
            default:
                return null;
        }
    }

    public static IDBAdapter getAdapter(){
        try {
            Properties p = loadProperties();
            String dbType = p.getProperty(DB_TYPE);
            return (IDBAdapter)Class.forName(dbType).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Properties loadProperties(){
        try{
            Properties p = new Properties();
            InputStream input = DBAdapterFactory.class.getClassLoader().getResourceAsStream("dbadapter.properties");
            p.load(input);
            return p;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
