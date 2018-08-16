package weblayout.pages;

import core.AndroidDriverCreator;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.net.MalformedURLException;

public abstract class BasePage {
    protected BasePage() throws MalformedURLException {
        HtmlElementLoader.populatePageObject(this, AndroidDriverCreator.getDriver());
    }
}
