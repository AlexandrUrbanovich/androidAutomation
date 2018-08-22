import com.google.inject.Inject;
import core.AndroidDriverCreator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import services.interfaces.IAndroidWifiServices;
import services.interfaces.IDisplayServices;
import services.interfaces.INotificationServices;
import services.interfaces.ISettingServices;
import tools.logger.LogMessage;

public class SettingTest extends SettingsForTests {
    private static final Logger log = Logger.getLogger(SettingTest.class);

    @Inject
    public ISettingServices settingServices;

    @Inject
    public IAndroidWifiServices androidWifiServices;

    @Inject
    public IDisplayServices displayServices;

    @Inject
    public INotificationServices notificationServices;

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
    public void androidWifiTest() {
        log.info(LogMessage.getLogTest("androidWifiTest"));

        settingServices.clickWifi();

        softAssert.assertEquals(androidWifiServices.getAndroidWifi(), true, "Android Wi-Fi not displayed");
        softAssert.assertEquals(androidWifiServices.getOnOffSelector(), true, "On Off Selector not displayed");

        softAssert.assertAll();

        AndroidDriverCreator.getDriver().navigate().back();
    }

    @Test
    public void displayedTest() {
        log.info(LogMessage.getLogTest("displayedTest"));

        settingServices.clickDisplayed();

        softAssert.assertEquals(displayServices.getBrightness(), true, "Brightness not displayed");
        softAssert.assertEquals(displayServices.getWallpaper(), true, "Wallpaper not displayed");
        softAssert.assertEquals(displayServices.getSleep(), true, "Sleep not displayed");
        softAssert.assertEquals(displayServices.getPowerButton(), true, "Power Button not displayed");
        softAssert.assertEquals(displayServices.getScreenSaver(), true, "Screen Saver not displayed");
        softAssert.assertEquals(displayServices.getFontSize(), true, "Font Size not displayed");
        softAssert.assertEquals(displayServices.getDisplaySize(), true, "Display Size not displayed");
        softAssert.assertEquals(displayServices.getRotate(), true, "Rotate not displayed");
        softAssert.assertEquals(displayServices.getCast(), true, "Cast not displayed");

        softAssert.assertAll();

        AndroidDriverCreator.getDriver().navigate().back();
    }

    @Test
    public void notificationTest() {
        log.info(LogMessage.getLogTest("notificationTest"));

        settingServices.clickNotification();

        softAssert.assertEquals(notificationServices.getAndroidKeyboard(), true, "Android Keyboard not displayed");
        softAssert.assertEquals(notificationServices.getApiDemos(), true, "API DEMON not displayed");
        softAssert.assertEquals(notificationServices.getAppiumSettings(), true, "Appium Settings not displayed");
        softAssert.assertEquals(notificationServices.getCalculator(), true, "Calculator not displayed");
        softAssert.assertEquals(notificationServices.getCalendar(), true, "Calendar not displayed");
        softAssert.assertEquals(notificationServices.getCamera(), true, "Camera not displayed");
        softAssert.assertEquals(notificationServices.getClock(), true, "Clock not displayed");
        softAssert.assertEquals(notificationServices.getContacts(), true, "Contacts not displayed");
        softAssert.assertEquals(notificationServices.getDocuments(), true, "Documents not displayed");

        softAssert.assertAll();

        AndroidDriverCreator.getDriver().navigate().back();
    }



}
