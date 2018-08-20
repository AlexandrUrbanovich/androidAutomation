package enums;

public enum PageName {
    SETTING_PAGE("Setting Page"),
    ANDROID_WIFI_PAGE("Android WiFi Page"),
    DISPLAY_PAGE("Display Page");

    public String name;

    PageName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
