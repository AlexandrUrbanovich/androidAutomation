import com.google.inject.Inject;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import services.interfaces.IAndroidWifiServices;
import services.interfaces.ISettingServices;
import tools.LogMessage;

import java.net.MalformedURLException;

public class SettingTest extends SettingsForTests {
    private static final Logger log = Logger.getLogger(SettingTest.class);

    @Inject
    public ISettingServices settingServices;

    @Inject
    public IAndroidWifiServices androidWifiServices;

    @Test
    public void settingTest() {
        log.info(LogMessage.getLogTest("settingTest"));

        softAssert.assertEquals(settingServices.getWifi(), true, "Wifi not displayed");
        softAssert.assertEquals(settingServices.getDisplay(), true, "Display not displayed");
        softAssert.assertEquals(settingServices.getNotifications(), true, "Notification not displayed");
        softAssert.assertEquals(settingServices.getSound(), true, "Sound not displayed");
        softAssert.assertEquals(settingServices.getApps(), true, "Apps not displayed");
        softAssert.assertEquals(settingServices.getStorage(), true, "Storage not displayed");
        softAssert.assertEquals(settingServices.getBattery(), true, "Battery not displayed");
        softAssert.assertEquals(settingServices.getMemory(), true, "Memory not displayed");
        softAssert.assertEquals(settingServices.getUsers(), true, "Users not displayed");

        softAssert.assertAll();

    }

    @Test
    public void androidWIfiTest() throws MalformedURLException {
        log.info(LogMessage.getLogTest("androidWIfiTest"));

        settingServices.clickWifi();

        softAssert.assertEquals(androidWifiServices.getAndroidWifi(), true, "Android Wi-Fi not displayed");
        softAssert.assertEquals(androidWifiServices.getOnOffSelector(), true, "On Off Selector not displayed");

        softAssert.assertAll();
    }


}
