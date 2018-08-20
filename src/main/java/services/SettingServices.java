package services;

import enums.PageName;
import org.apache.log4j.Logger;
import services.interfaces.ISettingServices;
import tools.LogMessage;
import weblayout.pages.SettingPage;

public class SettingServices extends PageProvider<SettingPage> implements ISettingServices {
    private static final Logger log = Logger.getLogger(SettingServices.class);

    private String pageName = PageName.SETTING_PAGE.getName();

    @Override
    public boolean getWifi() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getWifi().getTagName()));
        return getPage().getWifi().isDisplayed();
    }

    @Override
    public boolean getDisplay() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getDisplay().getTagName()));
        return getPage().getDisplay().isDisplayed();
    }

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


    @Override
    public void clickWifi() {
        log.info("Wifi was clicked");
        getPage().getWifi().click();
    }

}
