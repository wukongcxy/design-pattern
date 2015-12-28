package factorystatic.staticfactory;

import factorymethod.pizza.NYPizza;
import factorymethod.pizza.Pizza;

/**
 * Created by chenxinyue on 2015/12/28.
 */
public class NYPizzaFactory implements PizzaFactory {
    public Pizza create(String type) {
        if (type.equals("a pizza")) {
            return new NYPizza();
        } else if (type.equals("b pizza")) {
            return new NYPizza();
        }
        return new NYPizza();
    }
}
