package factorystatic.staticfactory;

import factorymethod.pizza.Pizza;

/**
 * Created by chenxinyue on 2015/12/28.
 */
public interface PizzaFactory {
    Pizza create(String type);
}
