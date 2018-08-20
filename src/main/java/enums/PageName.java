package enums;

public enum PageName {
    SETTING_PAGE("Setting Page"),
    ANDROID_WIFI_PAGE("Android WiFi Page"),
    DISPLAY_PAGE("Display Page"),
    NOTIFICATION_SERVICES("Notification Services");

    public String name;

    PageName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
