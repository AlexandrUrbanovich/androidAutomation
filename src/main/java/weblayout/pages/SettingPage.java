package weblayout.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.WebElement;

import java.time.temporal.ChronoUnit;

public class SettingPage extends BasePage {

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]")
    @WithTimeout(time = 20, chronoUnit = ChronoUnit.SECONDS)
    private WebElement wifi;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[9]")
    @WithTimeout(time = 20, chronoUnit = ChronoUnit.SECONDS)
    private WebElement display;

    @AndroidFindBy(accessibility = "AndroidWifi,Connected,Wifi signal full.")
    private WebElement androidWifi;

    @AndroidFindBy(id = "com.android.settings:id/switch_widget")
    private WebElement onOffSelector;

    public WebElement getWifi() {
        return wifi;
    }

    public WebElement getDisplay() {
        return display;
    }

    public WebElement getAndroidWifi() {
        return androidWifi;
    }

    public WebElement getOnOffSelector() {
        return onOffSelector;
    }
}
