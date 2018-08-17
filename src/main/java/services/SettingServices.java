package services;

import enums.PageName;
import org.apache.log4j.Logger;
import services.interfaces.ISettingServices;
import tools.LogMessage;
import weblayout.pages.SettingsPage;

public class SettingServices extends PageProvider<SettingsPage> implements ISettingServices {
    private static final Logger log = Logger.getLogger(SettingServices.class);

    private String pageName = PageName.SETTING_PAGE.getName();

    @Override
    public boolean getWifi() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getWifi().getName()));
        return getPage().getWifi().isDisplayed();
    }

    @Override
    public boolean getDisplay() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getDisplay().getName()));
        return getPage().getDisplay().isDisplayed();
    }

    @Override
    public void clickWifi() {
        getPage().getWifi().click();
    }

}
