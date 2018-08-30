import org.apache.log4j.Logger;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import services.modules.CustomFrameworkModule;
import tools.appiumServer.AppiumServerJava;

@Guice(modules = {CustomFrameworkModule.class})
public class SettingsForTests {
    private static final Logger log = Logger.getLogger(SettingsForTests.class);
    public static SoftAssert softAssert;

    AppiumServerJava appiumServerJava = new AppiumServerJava();

    @BeforeSuite
    public void beforeSuite() {
        appiumServerJava.startServer();
        log.info("Server RUN!!!");
    }

    @BeforeMethod
    public void beforeMethod() {
        softAssert = new SoftAssert();
        log.info("SoftAssert was created");
    }

    @AfterMethod
    public void afterMethod() {}

    @AfterSuite
    public void afterSuit() {
        appiumServerJava.stopServer();
        log.info("Server STOP!!!");
    }

}
