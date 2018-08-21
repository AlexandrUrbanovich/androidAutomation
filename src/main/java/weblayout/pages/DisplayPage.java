package weblayout.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DisplayPage extends BasePage {

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Brightness level.*\"))")
    private WebElement brightness;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Wallpaper.*\"))")
    private WebElement wallpaper;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Sleep.*\"))")
    private WebElement sleep;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Press power button twice for camera.*\"))")
    private WebElement powerButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Screen saver.*\"))")
    private WebElement screenSaver;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Font size.*\"))")
    private WebElement fontSize;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Display size.*\"))")
    private WebElement displaySize;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*When device is rotated.*\"))")
    private WebElement rotate;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\".*Cast.*\"))")
    private WebElement cast;

    public WebElement getBrightness() {
        return brightness;
    }

    public WebElement getWallpaper() {
        return wallpaper;
    }

    public WebElement getSleep() {
        return sleep;
    }

    public WebElement getPowerButton() {
        return powerButton;
    }

    public WebElement getScreenSaver() {
        return screenSaver;
    }

    public WebElement getFontSize() {
        return fontSize;
    }

    public WebElement getDisplaySize() {
        return displaySize;
    }

    public WebElement getRotate() {
        return rotate;
    }

    public WebElement getCast() {
        return cast;
    }
}
