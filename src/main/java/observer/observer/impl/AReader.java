package observer.observer.impl;

import observer.observer.Observer;
import observer.subject.Subject;

/**
 * Created by wukong on 15-12-26.
 */
public class AReader implements Observer {
    @Override
    public void update(String news) {
        System.out.println("A read news: " + news);
    }

    @Override
    public void register(Subject subject) {
        subject.registerObserver(this);
    }


}
