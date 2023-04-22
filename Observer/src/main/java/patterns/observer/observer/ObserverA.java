package patterns.observer.observer;

public class ObserverA implements IObserver {

    @Override
    public void notify(String command, Object source) {
        if(command.equals("dateFormat")){
            System.out.println("Observer A > Date change");
        }
    }
}
