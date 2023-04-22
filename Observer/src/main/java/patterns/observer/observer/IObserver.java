package patterns.observer.observer;

public interface IObserver {
    public void notify(String command, Object source);
}
