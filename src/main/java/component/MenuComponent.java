package component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenxinyue on 2016/1/6.
 */
public abstract class MenuComponent {
    private String name;
    private List<MenuComponent> childs;

    public MenuComponent(String name) {
        this.name = name;
        this.childs = new ArrayList<MenuComponent>();
    }

    String getName() {
        return this.name;
    }
    List<MenuComponent> getChilds() {
        return this.childs;
    }
    void print() {
        throw new UnsupportedOperationException();
    }
    void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }
    void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }
    MenuComponent getChild(Integer childIndex) {
        throw new UnsupportedOperationException();
    }
}
