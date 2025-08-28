package com.proxy.remoteproxy.server;

import java.rmi.*;

public class RemoteServer {
    public static void main(String[] args) {
        try {
            RemoteService remoteService = new RemoteServiceImpl();

//            Registry registry = LocateRegistry.createRegistry(1099);
//            registry.rebind("RemoteService", remoteService);
            String HOST = "localhost";
            int PORT = 1099;
            Naming.rebind("rmi://" + HOST + ":" + PORT + "/test", remoteService);

            System.out.println("Server Running...");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
