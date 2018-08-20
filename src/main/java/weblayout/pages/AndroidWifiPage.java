package weblayout.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AndroidWifiPage extends BasePage {

    @AndroidFindBy(accessibility = "AndroidWifi,Connected,Wifi signal full.")
    private WebElement androidWifi;

    @AndroidFindBy(id = "com.android.settings:id/switch_widget")
    private WebElement onOffSelector;

    public WebElement getAndroidWifi() {
        return androidWifi;
    }

    public WebElement getOnOffSelector() {
        return onOffSelector;
    }
}
