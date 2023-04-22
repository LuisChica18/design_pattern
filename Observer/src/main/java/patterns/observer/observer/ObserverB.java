package patterns.observer.observer;

public class ObserverB implements IObserver {

    @Override
    public void notify(String command, Object source) {
        if(command.equals("moneyFormat")){
            System.out.println("Observer B > Money change");
        }
    }
}
