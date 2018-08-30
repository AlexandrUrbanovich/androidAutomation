import org.testng.*;
import tools.annotation.PreconditionManager;
import tools.cmd.CmdManager;
import tools.cmd.enamCommand.CmdCommands;

public class InvokedMetod implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        PreconditionManager pManager = method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(PreconditionManager.class);

        System.out.println("pManager -> " + pManager);

        if(pManager != null){

            System.out.println("pManager.controllerWiFi -> " + pManager.controllerWiFi());

            if(pManager.controllerWiFi().equals("off")){
                CmdManager.cmdCommand(CmdCommands.WIFI_OFF.getCommand());
                System.out.println("Wifi is off");
            } else {
                System.out.println("Wifi is on");
            }
        }else{
            System.out.println("Annotation not present");
        }

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        CmdManager.cmdCommand(CmdCommands.WIFI_ON.getCommand());
        System.out.println("WiFi is on");
    }

}
