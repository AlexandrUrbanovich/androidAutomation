package weblayout.pages;

import core.AndroidDriverCreator;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.net.MalformedURLException;

public abstract class BasePage {
    protected BasePage() {
        try {
            HtmlElementLoader.populatePageObject(this, AndroidDriverCreator.getDriver());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
