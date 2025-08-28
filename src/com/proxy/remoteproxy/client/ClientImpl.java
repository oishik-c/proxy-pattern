package com.proxy.remoteproxy.client;

import com.proxy.remoteproxy.server.*;

import java.rmi.Naming;

public class ClientImpl {
    public static void main(String[] args) {
        new ClientImpl().go();
    }

    public void go(){
        try{
//            Registry registry = LocateRegistry.getRegistry("localhost");
//            RemoteService remoteService = (RemoteService) registry.lookup("RemoteService");
            String HOST = "localhost";
            int PORT = 1099;
            RemoteService remoteService = (RemoteService) Naming.lookup("rmi://"+HOST+":"+PORT+"/test");

            int response = remoteService.addTwoInt(1, 2);

            System.out.println("Response: " + response);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
