package component;

/**
 * Created by chenxinyue on 2016/1/6.
 */
public class Menu extends MenuComponent {

    public Menu(String name) {
        super(name);
    }


    public void print() {
        System.out.println("MENU:" + getName());
        for(MenuComponent menuComponent : getChilds()) {
            menuComponent.print();
        }
    }

    public void add(MenuComponent component) {
        getChilds().add(component);
    }

    public void remove(MenuComponent component) {
        getChilds().remove(component);
    }

    public MenuComponent getChild(Integer childIndex) {
        return getChilds().get(childIndex);
    }
}
