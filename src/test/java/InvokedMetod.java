import org.testng.*;
import tools.annotation.PreconditionManager;
import tools.cmd.CmdManager;
import tools.cmd.enamCommand.CmdCommands;

import java.lang.annotation.Annotation;

public class InvokedMetod implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        PreconditionManager pManager = method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(PreconditionManager.class);

        System.out.println("pManager -> " + pManager);

        Class<SettingTest> obj = SettingTest.class;

        System.out.println("obj.isAnnotation() -> " + obj.isAnnotation());

        if(obj.isAnnotationPresent(PreconditionManager.class)){
            Annotation annotation = obj.getAnnotation(PreconditionManager.class);
            PreconditionManager wifiControl = (PreconditionManager) annotation;

            System.out.println("WiFi : " + wifiControl.controllerWiFi());

            if(wifiControl.controllerWiFi() == "off"){
                CmdManager.cmdCommand(CmdCommands.WIFI_OFF.getCommand());
            } else {
                System.out.println("Wifi is on");
            }
        }else{
            System.out.println("Annotation not present");
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("afterInvocation is indefinite");
    }
}
