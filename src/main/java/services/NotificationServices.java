package services;

import enums.PageName;
import org.apache.log4j.Logger;
import services.interfaces.INotificationServices;
import tools.logger.LogMessage;
import weblayout.pages.NotificationPage;

public class NotificationServices extends PageProvider<NotificationPage> implements INotificationServices {
    private static final Logger log = Logger.getLogger(SettingServices.class);

    private String pageName = PageName.NOTIFICATION_SERVICES.getName();

    @Override
    public boolean getAndroidKeyboard() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getAndroidKeyboard().getText()));
        return getPage().getAndroidKeyboard().isDisplayed();
    }

    @Override
    public boolean getApiDemos() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getApiDemos().getText()));
        return getPage().getApiDemos().isDisplayed();
    }

    @Override
    public boolean getAppiumSettings() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getAppiumSettings().getText()));
        return getPage().getAppiumSettings().isDisplayed();
    }

    @Override
    public boolean getCalculator() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getCalculator().getText()));
        return getPage().getCalculator().isDisplayed();
    }

    @Override
    public boolean getCalendar() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getCalendar().getText()));
        return getPage().getCalendar().isDisplayed();
    }

    @Override
    public boolean getCamera() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getCamera().getText()));
        return getPage().getCamera().isDisplayed();
    }

    @Override
    public boolean getClock() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getClock().getText()));
        return getPage().getClock().isDisplayed();
    }

    @Override
    public boolean getContacts() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getContacts().getText()));
        return getPage().getContacts().isDisplayed();
    }

    @Override
    public boolean getDocuments() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getDocuments().getText()));
        return getPage().getDocuments().isDisplayed();
    }
}
