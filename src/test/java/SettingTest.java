import com.google.inject.Inject;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import services.interfaces.ISettingServices;
import tools.LogMessage;

import java.net.MalformedURLException;

public class SettingTest extends SettingsForTests {
    private static final Logger log = Logger.getLogger(SettingTest.class);

    @Inject
    ISettingServices settingServices;

    @Test
    public void settingPageCheckTest() throws MalformedURLException {
        log.info(LogMessage.getLogTest("settingPageCheckTest"));

        appiumServerJava.startServer();

        softAssert.assertEquals(settingServices.getWifi(), true, "Wi-Fi not displayed");
        softAssert.assertEquals(settingServices.getDisplay(), true, "Display not displayed");

        softAssert.assertAll();
    }

}
