package proxy.remote;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Created by wukong on 16-1-8.
 */
public class SayHelloServer {
    public static void main(String[] args) {
        start();
    }
    public static void start() {
        try {
            SayHello sayHello = new SayHelloImpl();
            //注册通讯端口
            LocateRegistry.createRegistry(6600);
            //注册通讯路径
            Naming.rebind("rmi://127.0.0.1:6600/sayHello", sayHello);
            System.out.println("Service Start!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
