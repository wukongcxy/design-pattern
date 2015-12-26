package strategy;

import strategy.duck.Duck;
import strategy.duck.impl.BlackDuck;
import strategy.duck.impl.RedDuck;

/**
 * Created by wukong on 15-12-26.
 */
public class Main {
    public static void main(String[] args) {
        Duck redDuck = new RedDuck();
        Duck blackDuck = new BlackDuck();
        redDuck.say();
        redDuck.run();
        redDuck.fly();
        blackDuck.say();
        blackDuck.run();
        blackDuck.fly();
    }
}
