package proxy.virtual;

/**
 * Created by chenxinyue on 2016/1/8.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Virtual Proxy demo!");
        Book book = new BoolProxy();
        System.out.println(book.readBook());
    }
}
