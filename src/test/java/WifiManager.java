import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tools.annotation.WifiControl;
import tools.cmd.CmdManager;
import tools.cmd.enamCommand.CmdCommands;

import java.lang.annotation.Annotation;

public class WifiManager implements ITestListener {
    private String cmdCommand = CmdCommands.WIFI_OFF.getCommand();

    @Override
    public void onTestStart(ITestResult result) {
        Class<SettingTest> obj = SettingTest.class;

        if(obj.isAnnotationPresent(WifiControl.class)){
            Annotation annotation = obj.getAnnotation(WifiControl.class);
            WifiControl wifiControl = (WifiControl) annotation;

            System.out.printf("WiFi : %s", wifiControl.controller());

            if(wifiControl.controller() == "off"){
                CmdManager.cmdCommand(cmdCommand);
            } else {
                System.out.println("Wifi is on");
            }
        }else{
            System.out.println("Annotation not present");
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("indefined");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("indefined");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("indefined");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("indefined");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("indefined");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("indefined");
    }
}
