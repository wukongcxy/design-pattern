package fatorymethod.store;

import fatorymethod.pizza.NYPizza;
import fatorymethod.pizza.Pizza;

/**
 * Created by chenxinyue on 2015/12/27.
 */
public class NYStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        System.out.println("creating NY Pizza!");
        if (type.equals("a pizza")) {
            return new NYPizza();
        } else if (type.equals("b pizza")) {
            return new NYPizza();
        }
        return new NYPizza();
    }
}
