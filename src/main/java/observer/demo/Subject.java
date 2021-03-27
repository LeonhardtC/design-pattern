package observer.demo;


import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Subject {

    List<Observer> observers = new CopyOnWriteArrayList<>();

    boolean async = true;

    public Subject add(Observer observer) {
        this.observers.add(observer);
        return this;
    }

    public Subject addAll(Collection<Observer> observers) {
        this.observers.addAll(observers);
        return this;
    }

    public void recieve(Event event) {
        if (async) {
            observers.forEach(o -> new Thread(() -> invokeObserver(o, event)).start());
        } else {
            observers.forEach(o -> invokeObserver(o, event));
        }
    }

    private void invokeObserver(Observer observer, Event event) {
        observer.doAction(event);
    }

}
