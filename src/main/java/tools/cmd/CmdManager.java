package tools.cmd;

public class CmdManager {

    public static void cmdCommand(String string) {
        try{
            Runtime.getRuntime().exec(string);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
