package decorator.beverage.impl;

import decorator.beverage.Beverage;

/**
 * Created by chenxinyue on 2015/12/27.
 */
public class ColaBeverage implements Beverage {
    public float getCost() {
        return 3.0f;
    }

    public void getDescription() {
        System.out.println("origin beverage is cola!");
    }
}
