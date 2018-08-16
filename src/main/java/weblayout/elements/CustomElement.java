package weblayout.elements;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;

public abstract class CustomElement extends TypifiedElement {
    private static final Logger log = Logger.getLogger(CustomElement.class);

    public CustomElement(WebElement wrappedElement) {
        super(wrappedElement);
    }

}
