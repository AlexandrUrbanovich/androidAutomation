package weblayout.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NotificationPage extends BasePage {

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().resourceIdMatches(\".*android:id/list.*\").scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Android.*\"))")
    private WebElement androidKeyboard;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*API Demos.*\"))")
    private WebElement apiDemos;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Appium Settings.*\"))")
    private WebElement appiumSettings;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Calculator.*\"))")
    private WebElement calculator;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Calendar.*\"))")
    private WebElement calendar;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Camera.*\"))")
    private WebElement camera;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Clock.*\"))")
    private WebElement clock;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().resourceIdMatches(\".*android:id/list.*\").scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Contacts.*\"))")
    private WebElement contacts;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().resourceIdMatches(\".*android:id/list.*\").scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Documents.*\"))")
    private WebElement documents;

    public WebElement getAndroidKeyboard() {
        return androidKeyboard;
    }

    public WebElement getApiDemos() {
        return apiDemos;
    }

    public WebElement getAppiumSettings() {
        return appiumSettings;
    }

    public WebElement getCalculator() {
        return calculator;
    }

    public WebElement getCalendar() {
        return calendar;
    }

    public WebElement getCamera() {
        return camera;
    }

    public WebElement getClock() {
        return clock;
    }

    public WebElement getContacts() {
        return contacts;
    }

    public WebElement getDocuments() {
        return documents;
    }
}
