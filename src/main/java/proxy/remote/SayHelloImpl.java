package proxy.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by wukong on 16-1-8.
 */
public class SayHelloImpl extends UnicastRemoteObject implements SayHello {
    public SayHelloImpl() throws RemoteException {
        super();
    }

    @Override
    public Model sayHello() throws RemoteException {
        Model model = new Model();
        model.setName("say hello!");
        return model;
    }
}
