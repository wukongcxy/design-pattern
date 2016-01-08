package proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by wukong on 16-1-8.
 */
public interface SayHello extends Remote {
    public Model sayHello() throws RemoteException;
}
