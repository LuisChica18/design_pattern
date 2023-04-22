package patterns.observer.observable;

import patterns.observer.observer.IObserver;

public interface IObservable {

    public void notifyAllObserver(String command, Object source);

    public void addObserver(IObserver observer);

    public void removeObserver(IObserver observer);
}
