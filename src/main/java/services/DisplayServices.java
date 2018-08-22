package services;

import enums.PageName;
import org.apache.log4j.Logger;
import services.interfaces.IDisplayServices;
import tools.logger.LogMessage;
import weblayout.pages.DisplayPage;

public class DisplayServices extends PageProvider<DisplayPage> implements IDisplayServices {
    private static final Logger log = Logger.getLogger(SettingServices.class);

    private String pageName = PageName.DISPLAY_PAGE.getName();

    @Override
    public boolean getBrightness() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getBrightness().getText()));
        return getPage().getBrightness().isDisplayed();
    }

    @Override
    public boolean getWallpaper() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getWallpaper().getText()));
        return getPage().getWallpaper().isDisplayed();
    }

    @Override
    public boolean getSleep() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getSleep().getText()));
        return getPage().getSleep().isDisplayed();
    }

    @Override
    public boolean getPowerButton() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getPowerButton().getText()));
        return getPage().getPowerButton().isDisplayed();
    }

    @Override
    public boolean getScreenSaver() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getScreenSaver().getText()));
        return getPage().getScreenSaver().isDisplayed();
    }

    @Override
    public boolean getFontSize() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getFontSize().getText()));
        return getPage().getFontSize().isDisplayed();
    }

    @Override
    public boolean getDisplaySize() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getDisplaySize().getText()));
        return getPage().getDisplaySize().isDisplayed();
    }

    @Override
    public boolean getRotate() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getRotate().getText()));
        return getPage().getRotate().isDisplayed();
    }

    @Override
    public boolean getCast() {
        log.info(LogMessage.getMessageThatElementPresentOnPage(pageName, getPage().getCast().getText()));
        return getPage().getCast().isDisplayed();
    }
}
