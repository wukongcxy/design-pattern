package factorystatic.staticfactory;

import factorymethod.pizza.Pizza;

/**
 * Created by chenxinyue on 2015/12/28.
 */
public abstract class StaticFactoryPizzaStore {
    protected PizzaFactory pizzaFactory;
    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }

    private Pizza createPizza(String type) {
        return pizzaFactory.create(type);
    }
}
