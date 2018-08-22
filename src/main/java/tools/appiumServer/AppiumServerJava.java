package tools.appiumServer;

import core.DesiredCapabilitiesManager;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.log4j.Logger;

public class AppiumServerJava {
    private static final Logger log = Logger.getLogger(AppiumServerJava.class);
    private AppiumDriverLocalService service;
    private AppiumServiceBuilder builder;

    public void startServer() {
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(4723);
        builder.withCapabilities(DesiredCapabilitiesManager.getCapabilities());
        builder.withArgument(GeneralServerFlag.LOG_LEVEL, "warn");

        service = AppiumDriverLocalService.buildService(builder);
        service.start();
    }

    public void stopServer() {
        service.stop();
    }

}

