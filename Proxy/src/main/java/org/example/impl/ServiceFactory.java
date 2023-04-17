package org.example.impl;

public class ServiceFactory {

    public static IProcessEjecutor createProcessEjecutor(){
        return new ProcessEjecutorProxy();
    }

}
