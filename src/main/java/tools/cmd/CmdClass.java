package tools.cmd;

public class CmdClass {

    public static void rebootEmulator() {
        try{
            Runtime.getRuntime().exec("adb -s emulator-5554 reboot");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
