package tools.cmd.enamCommand;

public enum cmdCommands {
    REBOOT("adb -s emulator-5554 reboot"),
    DELETE_ALL_DATE("adb shell pm clear com.android.settings");

    public String name;

    cmdCommands(String name) {this.name = name;}

    public String getCommand() {return name;}

}
