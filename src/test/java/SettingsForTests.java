import core.AndroidDriverCreator;
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
        log.info("Server RUN!!!");
        appiumServerJava.startServer();
    }

    @BeforeMethod
    public void beforeMethod() {
        log.info("SoftAssert was created");
        softAssert = new SoftAssert();
    }

//    @AfterTest
//    public void delCookie() {
//        log.info("Cookie was cleaned");
//        AndroidDriverCreator.getDriver().manage().deleteAllCookies();
//    }

    @AfterSuite
    public void afterSuit() {
        log.info("Server STOP!!!");
        appiumServerJava.stopServer();
    }
}
