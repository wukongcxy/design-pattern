package singleton;

/**
 * Created by chenxinyue on 2015/12/28.
 */
public class SingletonClass {
    private static SingletonClass singletonClass = new SingletonClass();
    public static SingletonClass getInstance() {
        return singletonClass;
    }

}
