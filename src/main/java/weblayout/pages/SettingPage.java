package weblayout.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.WebElement;

import java.time.temporal.ChronoUnit;

public class SettingPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Apps\"]")
    private WebElement appss;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Settings\"]")
    private WebElement settings;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Wi‑Fi.*\"))")
    @WithTimeout(time = 20, chronoUnit = ChronoUnit.SECONDS)
    private WebElement wifi;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Display.*\"))")
    private WebElement display;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Notifications.*\"))")
    private WebElement notifications;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Sound.*\"))")
    private WebElement sound;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Apps.*\"))")
    private WebElement apps;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Storage.*\"))")
    private WebElement storage;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Battery.*\"))")
    private WebElement battery;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Memory.*\"))")
    private WebElement memory;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Users.*\"))")
    private WebElement users;

    public WebElement getWifi() {
        return wifi;
    }

    public WebElement getDisplay() {
        return display;
    }

    public WebElement getNotifications() {
        return notifications;
    }

    public WebElement getSound() {
        return sound;
    }

    public WebElement getApps() {
        return apps;
    }

    public WebElement getStorage() {
        return storage;
    }

    public WebElement getBattery() {
        return battery;
    }

    public WebElement getMemory() {
        return memory;
    }

    public WebElement getUsers() {
        return users;
    }

    public WebElement getAppss() {
        return appss;
    }

    public WebElement getSettings() {
        return settings;
    }
}
