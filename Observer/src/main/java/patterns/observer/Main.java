package patterns.observer;

import patterns.observer.config.ConfigurationManager;
import patterns.observer.observer.ObserverA;
import patterns.observer.observer.ObserverB;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {

        ConfigurationManager manager = ConfigurationManager.getInstance();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        NumberFormat moneyFormat = new DecimalFormat("###,##0.00");



        ObserverA a = new ObserverA();
        ObserverB b = new ObserverB();
        manager.addObserver(a);
        manager.addObserver(b);

        manager.setDateFormat(dateFormat);
        manager.setMoneyFormat(moneyFormat);

        // if remove observerA not show changes
        //manager.removeObserver(a);

        manager.setDateFormat(new SimpleDateFormat("MM/dd/yyyy"));

        System.out.println("Fin");
    }
}
