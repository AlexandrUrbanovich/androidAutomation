package core;

import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverCreator {
    private static final Logger log = Logger.getLogger(AndroidDriverCreator.class);

    private static AndroidDriver driver;

    public static AndroidDriver getDriver()  {
        if(driver == null) {
            try {
                driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), DesiredCapabilitiesManager.getCapabilities());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            log.info("Create AndroidDriver if driver null");
        }
        log.info("Using create driver");
        return driver;
    }

}
