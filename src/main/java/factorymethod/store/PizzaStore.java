package factorymethod.store;

import factorymethod.pizza.Pizza;

/**
 * Created by chenxinyue on 2015/12/27.
 */
public abstract class PizzaStore {

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }

    protected abstract Pizza createPizza(String type);


}
