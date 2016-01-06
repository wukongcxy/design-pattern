package component;

/**
 * Created by chenxinyue on 2016/1/6.
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name) {
        super(name);
    }

    public void print() {
        System.out.println("MENU ITEM:" + getName());
    }

}
