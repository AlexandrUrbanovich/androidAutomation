package core;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesManager {
    private static final Logger log = Logger.getLogger(DesiredCapabilitiesManager.class);

    public static DesiredCapabilities getCapabilities(){
        log.info("Set capability");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
        capabilities.setCapability("platfotmVersion", "7.0");

        return capabilities;
    }

}
