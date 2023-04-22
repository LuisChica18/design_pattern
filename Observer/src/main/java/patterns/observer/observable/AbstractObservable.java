package patterns.observer.observable;

import patterns.observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObservable implements IObservable {

    private final List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver(String command, Object source) {
        for (IObserver observer:observers) {
            observer.notify(command, source);
        }
    }
}
