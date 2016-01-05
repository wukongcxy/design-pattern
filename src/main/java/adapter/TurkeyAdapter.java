package adapter;

/**
 * Created by chenxinyue on 2016/1/5.
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void say() {
        turkey.turkeySay();
    }
}
