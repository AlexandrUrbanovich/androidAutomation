package enums;

public enum WiFi {
    WIFI_ON("on"),
    WIFI_OFF("off");

    public String name;

    WiFi(String name){this.name = name;}

    public String getName() {
        return name;
    }
}
