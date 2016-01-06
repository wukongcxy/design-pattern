package component;

/**
 * Created by chenxinyue on 2016/1/6.
 */
public class Main {
    public static void main(String[] args) {
        MenuComponent rootMenu = new Menu("root Menu");
        MenuComponent lunchMenu = new Menu("lunch Menu");
        MenuComponent dinnerMenu = new Menu("dinner Menu");
        rootMenu.add(lunchMenu);
        rootMenu.add(dinnerMenu);

        MenuComponent lunchMenuItem1 = new MenuItem("lunch item 1");
        MenuComponent lunchMenuItem2 = new MenuItem("lunch item 2");
        MenuComponent lunchMenuItem3 = new MenuItem("lunch item 3");
        MenuComponent lunchMenuItem4 = new MenuItem("lunch item 4");
        lunchMenu.add(lunchMenuItem1);
        lunchMenu.add(lunchMenuItem2);
        lunchMenu.add(lunchMenuItem3);
        lunchMenu.add(lunchMenuItem4);

        MenuComponent dinnerMenuItem1 = new MenuItem("dinner item 1");
        MenuComponent dinnerMenuItem2 = new MenuItem("dinner item 2");
        MenuComponent dinnerMenuItem3 = new MenuItem("dinner item 3");
        MenuComponent dinnerMenuItem4 = new MenuItem("dinner item 4");
        MenuComponent dinnerMenuChildMenu = new Menu("dinnerMenu child menu");
        dinnerMenu.add(dinnerMenuItem1);
        dinnerMenu.add(dinnerMenuItem2);
        dinnerMenu.add(dinnerMenuItem3);
        dinnerMenu.add(dinnerMenuChildMenu);
        dinnerMenu.add(dinnerMenuItem4);

        MenuComponent subMenuItem1 = new MenuItem("subMenu item 1");
        MenuComponent subMenuItem2 = new MenuItem("subMenu item 2");
        MenuComponent subMenuItem3 = new MenuItem("subMenu item 3");
        dinnerMenuChildMenu.add(subMenuItem1);
        dinnerMenuChildMenu.add(subMenuItem2);
        dinnerMenuChildMenu.add(subMenuItem3);

        rootMenu.print();

    }
}
