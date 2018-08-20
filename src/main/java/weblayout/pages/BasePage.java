package weblayout.pages;

import core.AndroidDriverCreator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public abstract class BasePage {

    protected BasePage() {
        try {
            PageFactory.initElements(new AppiumFieldDecorator(AndroidDriverCreator.getDriver()), this);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
