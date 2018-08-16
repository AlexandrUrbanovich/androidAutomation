import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.asserts.SoftAssert;
import services.modules.CustomFrameworkModule;

@Guice(modules = {CustomFrameworkModule.class})
public class SettingsForTests {
    private static final Logger log = Logger.getLogger(SettingsForTests.class);
    public static SoftAssert softAssert;

    @BeforeMethod
    public void beforeMethod() {
        log.info("SoftAssert was created");
        softAssert = new SoftAssert();
    }

}
