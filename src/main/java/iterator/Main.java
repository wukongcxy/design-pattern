package iterator;

/**
 * Created by chenxinyue on 2016/1/5.
 */
public class Main {
    public static void main(String[] args) {
        LunchMenu lunchMenu = new LunchMenu();
        Iterator lunchIterator = lunchMenu.createIterator();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        readMenu(lunchIterator);
        readMenu(dinnerIterator);
    }

    private static void readMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
