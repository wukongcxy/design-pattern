package decorator.decorator;

import decorator.beverage.Beverage;

/**
 * Created by chenxinyue on 2015/12/27.
 */
public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage;
    protected float cost;


    public float getCost() {
        return beverage.getCost() + this.cost;
    }

    public abstract void getDescription();
}
