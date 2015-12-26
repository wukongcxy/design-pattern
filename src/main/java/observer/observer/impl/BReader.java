package observer.observer.impl;

import observer.observer.Observer;
import observer.subject.Subject;

/**
 * Created by wukong on 15-12-26.
 */
public class BReader implements Observer {
    @Override
    public void update(String news) {
        System.out.println("B read news: " + news);
    }

    @Override
    public void register(Subject subject) {
        subject.registerObserver(this);
    }
}
