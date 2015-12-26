package strategy.duck.impl;

import strategy.duck.Duck;
import strategy.strategy.impl.FlyableBehavior;

/**
 * Created by wukong on 15-12-26.
 */
public class RedDuck extends DefaultDuck implements Duck {

    public RedDuck() {
        this.flyBehavior = new FlyableBehavior();
    }

    @Override
    public void say() {
        System.out.println("I'm a red Duck!");
    }
}
