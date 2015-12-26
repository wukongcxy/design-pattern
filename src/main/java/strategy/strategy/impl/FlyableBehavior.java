package strategy.strategy.impl;

import strategy.strategy.FlyBehavior;

/**
 * Created by wukong on 15-12-26.
 */
public class FlyableBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly fly fly!");
    }
}
