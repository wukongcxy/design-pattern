package factorymethod.pizza;

/**
 * Created by chenxinyue on 2015/12/27.
 */
public abstract class Pizza {
    protected String name;
    public void prepare() {
        System.out.println(name + ": prepare!");
    }

    public void bake() {
        System.out.println(name + ": bake!");
    }

    public void cut() {
        System.out.println(name + ": cut!");
    }
}
