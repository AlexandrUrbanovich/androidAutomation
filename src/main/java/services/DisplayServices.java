package services;

import enums.PageName;
import org.apache.log4j.Logger;
import services.interfaces.IDisplayServices;
import tools.LogMessage;
import weblayout.pages.DisplayPage;

public class DisplayServices extends PageProvider<DisplayPage> implements IDisplayServices {
    private static final Logger log = Logger.getLogger(SettingServices.class);

    private String pageName = PageName.DISPLAY_PAGE.getName();

    @Override
    public boolean getBrightness() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getBrightness().getTagName()));
        return getPage().getBrightness().isDisplayed();
    }

    @Override
    public boolean getWallpaper() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getWallpaper().getTagName()));
        return getPage().getWallpaper().isDisplayed();
    }

    @Override
    public boolean getSleep() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getSleep().getTagName()));
        return getPage().getSleep().isDisplayed();
    }

    @Override
    public boolean getPowerButton() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getPowerButton().getTagName()));
        return getPage().getPowerButton().isDisplayed();
    }

    @Override
    public boolean getScreenSaver() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getScreenSaver().getTagName()));
        return getPage().getScreenSaver().isDisplayed();
    }

    @Override
    public boolean getFontSize() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getFontSize().getTagName()));
        return getPage().getFontSize().isDisplayed();
    }

    @Override
    public boolean getDisplaySize() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getDisplaySize().getTagName()));
        return getPage().getDisplaySize().isDisplayed();
    }

    @Override
    public boolean getRotate() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getRotate().getTagName()));
        return getPage().getRotate().isDisplayed();
    }

    @Override
    public boolean getCast() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getCast().getTagName()));
        return getPage().getCast().isDisplayed();
    }
}
