package singleton;

/**
 * Created by chenxinyue on 2015/12/28.
 */
public class Main {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);
    }


}
