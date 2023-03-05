package org.example.impl;

import org.example.services.impl.rest.RestServiceStackImpl;
import org.example.services.impl.ws.WSServiceStackImpl;

import java.io.InputStream;
import java.util.Properties;

public class ServiceStackAbstractFactory {

    private static final String CONFIG_PATH = "abstractfactory.properties";

    public static IServiceStackAbstractFactory createServiceFactory(ServiceType type){
        switch (type){
            case SOAP:
                return new WSServiceStackImpl();
            case RestFul:
                return new RestServiceStackImpl();
            default:
                return null;
        }
    }

    public static IServiceStackAbstractFactory createServiceFactory(){
        try {
            Properties props = loadProperties();
            String concreteFactry = props.getProperty("defaultFamily");

            IServiceStackAbstractFactory factoryImpl = (IServiceStackAbstractFactory)Class.forName(concreteFactry).newInstance();
            return factoryImpl;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Properties loadProperties(){
        try{
            Properties p = new Properties();
            InputStream input = ServiceStackAbstractFactory.class.getClassLoader().getResourceAsStream(CONFIG_PATH);
            p.load(input);
            return p;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
