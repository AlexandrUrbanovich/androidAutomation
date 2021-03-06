package services;

import enums.PageName;
import org.apache.log4j.Logger;
import services.interfaces.ISettingServices;
import tools.logger.LogMessage;
import weblayout.pages.SettingPage;

public class SettingServices extends PageProvider<SettingPage> implements ISettingServices {
    private static final Logger log = Logger.getLogger(SettingServices.class);

    private String pageName = PageName.SETTING_PAGE.getName();

    @Override
    public void clickWidjet() {
        getPage().getWidjet().click();
    }

    @Override
    public void clickAppss() {
        getPage().getAppss().click();
        log.info("Appss was clicked");
    }

    @Override
    public void clickSettings() {
        getPage().getSettings().click();
        log.info("Settings was clicked");
    }

    @Override
    public boolean getWifi() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getWifi().getText()));
        return getPage().getWifi().isDisplayed();
    }

    @Override
    public void clickWifi() {
        getPage().getWifi().click();
        log.info("Wifi was clicked");
    }

    @Override
    public boolean getDisplay() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getDisplay().getText()));
        return getPage().getDisplay().isDisplayed();
    }

    @Override
    public void clickDisplayed() {
        getPage().getDisplay().click();
        log.info("Displayed was clicked");
    }

    @Override
    public boolean getNotifications() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getNotifications().getText()));
        return getPage().getNotifications().isDisplayed();
    }

    @Override
    public void clickNotification() {
        getPage().getNotifications().click();
        log.info("Notification was clicked");
    }

    @Override
    public boolean getSound() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getSound().getText()));
        return getPage().getSound().isDisplayed();
    }

    @Override
    public boolean getApps() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getApps().getText()));
        return getPage().getApps().isDisplayed();
    }

    @Override
    public boolean getStorage() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getStorage().getText()));
        return getPage().getStorage().isDisplayed();
    }

    @Override
    public boolean getBattery() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getBattery().getText()));
        return getPage().getBattery().isDisplayed();
    }

    @Override
    public boolean getMemory() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getMemory().getText()));
        return getPage().getMemory().isDisplayed();
    }

    @Override
    public boolean getUsers() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getUsers().getText()));
        return getPage().getUsers().isDisplayed();
    }

}
