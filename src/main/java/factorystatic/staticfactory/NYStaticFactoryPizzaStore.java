package factorystatic.staticfactory;

/**
 * Created by chenxinyue on 2015/12/28.
 */
public class NYStaticFactoryPizzaStore extends StaticFactoryPizzaStore {
    public NYStaticFactoryPizzaStore() {
        this.pizzaFactory = new NYPizzaFactory();
    }
}
