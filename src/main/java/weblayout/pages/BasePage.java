package weblayout.pages;

import core.AndroidDriverCreator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    protected BasePage() {
            PageFactory.initElements(new AppiumFieldDecorator(AndroidDriverCreator.getDriver()), this);

    }

}
