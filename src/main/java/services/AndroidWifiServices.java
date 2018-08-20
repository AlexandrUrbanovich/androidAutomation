package services;

import enums.PageName;
import org.apache.log4j.Logger;
import services.interfaces.IAndroidWifiServices;
import tools.LogMessage;
import weblayout.pages.AndroidWifiPage;

public class AndroidWifiServices extends PageProvider<AndroidWifiPage> implements IAndroidWifiServices {
    private static final Logger log = Logger.getLogger(SettingServices.class);

    private String pageName = PageName.SETTING_PAGE.getName();

    @Override
    public boolean getAndroidWifi() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getAndroidWifi().getTagName()));
        return getPage().getAndroidWifi().isDisplayed();
    }

    @Override
    public boolean getOnOffSelector() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getOnOffSelector().getTagName()));
        return getPage().getOnOffSelector().isEnabled();
    }

}
