package services;

import enums.PageName;
import org.apache.log4j.Logger;
import services.interfaces.INotificationServices;
import tools.LogMessage;
import weblayout.pages.NotificationPage;

public class NotificationServices extends PageProvider<NotificationPage> implements INotificationServices {
    private static final Logger log = Logger.getLogger(SettingServices.class);

    private String pageName = PageName.NOTIFICATION_SERVICES.getName();

    @Override
    public boolean getAndroidKeyboard() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getAndroidKeyboard().getTagName()));
        return getPage().getAndroidKeyboard().isDisplayed();
    }

    @Override
    public boolean getApiDemos() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getApiDemos().getTagName()));
        return getPage().getApiDemos().isDisplayed();
    }

    @Override
    public boolean getAppiumSettings() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getAppiumSettings().getTagName()));
        return getPage().getAppiumSettings().isDisplayed();
    }

    @Override
    public boolean getCalculator() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getCalculator().getTagName()));
        return getPage().getCalculator().isDisplayed();
    }

    @Override
    public boolean getCalendar() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getCalendar().getTagName()));
        return getPage().getCalendar().isDisplayed();
    }

    @Override
    public boolean getCamera() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getCamera().getTagName()));
        return getPage().getCamera().isDisplayed();
    }

    @Override
    public boolean getClock() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getClock().getTagName()));
        return getPage().getClock().isDisplayed();
    }

    @Override
    public boolean getContacts() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getContacts().getTagName()));
        return getPage().getContacts().isDisplayed();
    }
}
