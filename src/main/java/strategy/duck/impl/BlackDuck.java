package strategy.duck.impl;

import strategy.duck.Duck;
import strategy.strategy.impl.DisFlyableBehavior;

/**
 * Created by wukong on 15-12-26.
 */
public class BlackDuck extends DefaultDuck implements Duck {
    public BlackDuck() {
        this.flyBehavior = new DisFlyableBehavior();
    }

    @Override
    public void say() {
        System.out.println("I'm a black duck!");
    }
}
