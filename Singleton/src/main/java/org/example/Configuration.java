package org.example;

import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    public static final String PATH_PROPERTIES = "config.properties";

    // 2 Step.- variable self type static
    private static Configuration config;

    private String appName;
    private String appVersion;
    private String dateFormat;
    private String currencyDate;

    // 1 Step.- Contructor private (only call self)
    private Configuration(){
        try {
            InputStream stream = Configuration.class.getClassLoader().getResourceAsStream(PATH_PROPERTIES);
            Properties props = new Properties();
            props.load(stream);
            this.appName = props.getProperty("appName");
            this.appVersion = props.getProperty("appVersion");
            this.dateFormat = props.getProperty("dateFormat");
            this.currencyDate = props.getProperty("currencyDate");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3 Step. method getInstance
    public static Configuration getInstance(){
        if (config == null){
            config = new Configuration();
        }
        return config;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getCurrencyDate() {
        return currencyDate;
    }

    public void setCurrencyDate(String currencyDate) {
        this.currencyDate = currencyDate;
    }
}
