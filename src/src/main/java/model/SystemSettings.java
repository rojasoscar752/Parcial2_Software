package model;

public class SystemSettings {
    private SystemSettings instance;
    private String language;


    private SystemSettings(){};
    public SystemSettings getInstance(){
        if (instance == null) {
            instance = new SystemSettings();
        }
        return instance;
    }
}
