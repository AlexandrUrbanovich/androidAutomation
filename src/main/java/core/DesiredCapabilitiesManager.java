package core;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesManager {
    private static final Logger log = Logger.getLogger(DesiredCapabilitiesManager.class);

    public static DesiredCapabilities getCapabilities(){
        log.info("Set capability");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Nexus 5X API 24");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("appPackage", "com.android.settings");
//        capabilities.setCapability("appPackage", "com.android.launcher3");
        capabilities.setCapability("appActivity", "com.android.settings.Settings");
//        capabilities.setCapability("appActivity", "com.android.launcher3.Launcher");

        return capabilities;
    }

}
