package proxy.remote;

import java.rmi.Naming;

/**
 * Created by wukong on 16-1-8.
 */
public class Client {
    public static SayHello getSayHello() {
        try{
            //调用远程对象，注意RMI路径与接口必须与服务器配置一致
            SayHello sayHello = (SayHello) Naming.lookup("rmi://127.0.0.1:6600/sayHello");
            return sayHello;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
