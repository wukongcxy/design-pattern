package factorystatic.staticfactory;

/**
 * Created by chenxinyue on 2015/12/28.
 */
public class Main {
    public static void main(String[] args) {
        StaticFactoryPizzaStore store = new NYStaticFactoryPizzaStore();
        store.orderPizza("a pizza");
    }

}
