package com.proxy.remoteproxy.server;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class RemoteServiceImpl extends UnicastRemoteObject implements RemoteService {
    public RemoteServiceImpl() throws RemoteException {
//        super();
    }

    @Override
    public int addTwoInt(int a, int b) throws RemoteException {
        return a+b;
    }
}
