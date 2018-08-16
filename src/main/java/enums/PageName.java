package enums;

public enum PageName {
    SETTING_PAGE("Setting Page");

    public String name;

    PageName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
