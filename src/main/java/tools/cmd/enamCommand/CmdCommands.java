package tools.cmd.enamCommand;

public enum CmdCommands {
    REBOOT("adb -s emulator-5554 reboot"),
    DELETE_ALL_DATE("adb shell pm clear com.android.settings"),
    DEVICE("adb device"),
    SHELL("adb shell"),
//    WIFI_ON("adb root && adb shell svc wifi enable"),
    WIFI_ON("C:/Users/Aliaksandr_Urbanovic/AppData/Local/Android/Sdk/platform-tools/adb -s %s shell svc wifi enable"),
//    WIFI_OFF("adb root && adb shell svc wifi disable");
    WIFI_OFF("C:/Users/Aliaksandr_Urbanovic/AppData/Local/Android/Sdk/platform-tools/adb -s %s shell svc wifi disable");

    public String value;

    CmdCommands(String value) {this.value = value;}

    public String getCommand(String udid) {
        return String.format(value, udid);
    }

}
