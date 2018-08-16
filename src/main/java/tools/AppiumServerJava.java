package tools;

import core.DesiredCapabilitiesManager;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
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

        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        log.info("Server RUN!!!");
    }

    public void stopServer() {
        service.stop();
    }

}

