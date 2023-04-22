package patterns.observer.config;

import patterns.observer.observable.AbstractObservable;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class ConfigurationManager extends AbstractObservable {

    private static ConfigurationManager configurationManager;

    private SimpleDateFormat dateFormat;
    private NumberFormat moneyFormat;

    private ConfigurationManager(){

    }

    public synchronized static ConfigurationManager getInstance(){
        if(configurationManager == null){
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
        super.notifyAllObserver("dateFormat", this);
    }

    public NumberFormat getMoneyFormat() {
        return moneyFormat;
    }

    public void setMoneyFormat(NumberFormat moneyFormat) {
        this.moneyFormat = moneyFormat;
        super.notifyAllObserver("moneyFormat", this);
    }
}
