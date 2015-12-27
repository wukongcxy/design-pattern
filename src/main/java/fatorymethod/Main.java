package fatorymethod;

import fatorymethod.store.NYStore;
import fatorymethod.store.PizzaStore;

/**
 * Created by chenxinyue on 2015/12/27.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore nyStory = new NYStore();
        nyStory.orderPizza("a pizza");

    }
}
