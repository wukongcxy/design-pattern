package proxy.remote;

import java.rmi.RemoteException;

/**
 * Created by wukong on 16-1-8.
 */
public class Main {
    public static void main(String[] args) throws RemoteException {
        SayHello sayHello = Client.getSayHello();
        Model model = sayHello.sayHello();
        System.out.println(model.getName());
    }
}
