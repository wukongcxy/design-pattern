package strategy.duck.impl;

import strategy.duck.Duck;
import strategy.strategy.FlyBehavior;

/**
 * Created by wukong on 15-12-26.
 */
public abstract class DefaultDuck implements Duck {
    protected FlyBehavior flyBehavior;
    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public abstract void say();



    @Override
    public void run() {
        System.out.println("I'm Runing!");
    }
}
