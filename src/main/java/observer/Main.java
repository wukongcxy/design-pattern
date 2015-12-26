package observer;

import observer.observer.Observer;
import observer.observer.impl.AReader;
import observer.observer.impl.BReader;
import observer.subject.Subject;
import observer.subject.impl.TimesSubject;

/**
 * Created by wukong on 15-12-26.
 */
public class Main {
    public static void main(String[] args) {
        Observer aReader = new AReader();
        Observer bReader = new BReader();
        Subject times = new TimesSubject();
        aReader.register(times);
        bReader.register(times);
        times.notifyObserver();
    }
}
