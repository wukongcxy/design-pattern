package iterator;

import java.util.Arrays;
import java.util.List;

/**
 * Created by chenxinyue on 2016/1/5.
 */
public class DinnerMenu {
    List<String> menus;

    public DinnerMenu() {
        this.menus = Arrays.asList("dinner1", "dinner2", "dinner3");
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(this.menus);
    }
}

class DinnerMenuIterator implements Iterator {
    private List<String> menus;
    private Integer cur;
    public DinnerMenuIterator(List<String> menus) {
        this.menus = menus;
        this.cur = 0;
    }

    public boolean hasNext() {
        if (cur < this.menus.size()) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        return this.menus.get(cur++);
    }
}
