import com.google.inject.Inject;
import core.AndroidDriverCreator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import services.interfaces.ISettingServices;
import tools.LogMessage;

import java.net.MalformedURLException;

public class SettingTest extends SettingsForTests {
    private static final Logger log = Logger.getLogger(SettingTest.class);

    @Inject
    public ISettingServices settingServices;

    @Test
    public void settingPageCheckTest() throws MalformedURLException {
        log.info(LogMessage.getLogTest("settingPageCheckTest"));

//        AndroidDriverCreator.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]")).click();

        settingServices.clickWifi();

        softAssert.assertEquals(settingServices.getWifi(), true, "Wi-Fi not displayed");
        softAssert.assertEquals(settingServices.getDisplay(), true, "Display not displayed");

        softAssert.assertAll();
    }
}
