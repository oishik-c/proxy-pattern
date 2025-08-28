package com.proxy.remoteproxy.server;

import java.rmi.*;

public interface RemoteService extends Remote {
//    The arg and return types must be Serializable
    int addTwoInt(int a, int b) throws RemoteException;
}
