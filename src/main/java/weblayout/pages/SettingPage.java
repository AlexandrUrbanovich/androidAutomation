package weblayout.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import weblayout.elements.CLabel;

import java.time.temporal.ChronoUnit;

public class SettingPage extends BasePage {

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]")
    @WithTimeout(time = 20, chronoUnit = ChronoUnit.SECONDS)
    private CLabel wifi;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[9]")
    @WithTimeout(time = 20, chronoUnit = ChronoUnit.SECONDS)
    private CLabel display;

    public CLabel getWifi() {
        return wifi;
    }

    public CLabel getDisplay() {
        return display;
    }
}
