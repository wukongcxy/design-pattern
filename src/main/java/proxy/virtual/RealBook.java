package proxy.virtual;

/**
 * Created by chenxinyue on 2016/1/8.
 */
public class RealBook implements Book{
    public RealBook() throws InterruptedException {
        Thread.sleep(5000L);
    }

    public String readBook() {
        return "head first design pattern!";
    }
}
