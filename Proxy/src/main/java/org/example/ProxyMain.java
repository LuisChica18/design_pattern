package org.example;

import org.example.impl.IProcessEjecutor;
import org.example.impl.ServiceFactory;

public class ProxyMain {

    public static void main(String[] args) {
        String user = "LuisChica";
        String password = "2323";
        int process = 1;
        IProcessEjecutor processEjecutor = ServiceFactory.createProcessEjecutor();
        try {
            processEjecutor.ejecuteProcess(process, user, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
