package observer.observer;

import observer.subject.Subject;

/**
 * Created by wukong on 15-12-26.
 */
public interface Observer {
    void update(String news);
    void register(Subject subject);
}
