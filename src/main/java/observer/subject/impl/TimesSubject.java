package observer.subject.impl;

import observer.observer.Observer;
import observer.subject.Subject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by wukong on 15-12-26.
 */
public class TimesSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update("news at" + new Date());
        }
    }
}
