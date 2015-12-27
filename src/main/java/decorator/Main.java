package decorator;

import decorator.beverage.Beverage;
import decorator.beverage.impl.ColaBeverage;
import decorator.decorator.Milk;
import decorator.decorator.Mocha;

/**
 * Created by chenxinyue on 2015/12/27.
 */
public class Main {
    public static void main(String[] args) {
        Beverage cola = new ColaBeverage();
        cola = new Milk(new Milk(cola));
        cola = new Mocha(cola);
        cola.getDescription();
        System.out.println("cost is " + cola.getCost());

    }
}
