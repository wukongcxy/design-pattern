package iterator;

/**
 * Created by chenxinyue on 2016/1/5.
 */
public class LunchMenu implements Iterator {
    String[] menus;
    Integer cur;
    public LunchMenu() {
        this.menus = new String[] {"lunch1", "lunch2", "lunch3"};
        this.cur = 0;
    }

    public boolean hasNext() {
        if (this.cur < this.menus.length) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        return this.menus[cur++];
    }

    public Iterator createIterator() {
        return this;
    }
}

