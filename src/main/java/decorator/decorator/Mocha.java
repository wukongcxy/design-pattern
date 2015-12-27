package decorator.decorator;

import decorator.beverage.Beverage;

/**
 * Created by chenxinyue on 2015/12/27.
 */
public class Mocha extends CondimentDecorator implements Beverage {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.cost = 2.0f;
    }

    @Override
    public void getDescription() {
        this.beverage.getDescription();
        System.out.println("add som Mocha!");
    }
}
