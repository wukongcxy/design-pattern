package decorator.decorator;

import decorator.beverage.Beverage;

/**
 * Created by chenxinyue on 2015/12/27.
 */
public class Milk extends CondimentDecorator implements Beverage {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.cost = 1.5f;
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("add some milk!");
    }
}
