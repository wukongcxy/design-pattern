package adapter;

/**
 * Created by chenxinyue on 2016/1/5.
 */
public class Main {
    public static void main(String[] args) {
        TurkeyAdapter turkey = new TurkeyAdapter(new RedTurkey());
        letDuckSay(turkey);
    }

    private static void letDuckSay(Duck duck) {
        duck.say();
    }
}
