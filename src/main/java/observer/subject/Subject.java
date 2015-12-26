package observer.subject;


import observer.observer.Observer;

/**
 * Created by wukong on 15-12-26.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
