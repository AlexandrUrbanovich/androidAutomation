import org.apache.log4j.Logger;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import services.modules.CustomFrameworkModule;
import tools.appiumServer.AppiumServerJava;
import tools.cmd.enamCommand.CmdCommands;

@Guice(modules = {CustomFrameworkModule.class})
@Listeners(WifiManager.class)
public class SettingsForTests {
    private static final Logger log = Logger.getLogger(SettingsForTests.class);
    public static SoftAssert softAssert;
    private String cmdCommand = CmdCommands.REBOOT.getCommand();

    AppiumServerJava appiumServerJava = new AppiumServerJava();

    @BeforeSuite
    public void beforeSuite() {
        appiumServerJava.startServer();
        log.info("Server RUN!!!");
    }

    @BeforeMethod
    public void beforeMethod() {

//        appiumServerJava.startServer();
//        log.info("Server RUN!!!");
        softAssert = new SoftAssert();
        log.info("SoftAssert was created");
    }

    @AfterMethod
    public void afterMethod() {
//        appiumServerJava.stopServer();
//        log.info("Server STOP!!!");

//        CmdManager.cmdCommand(cmdCommand);
//        try {
//            Thread.sleep(30000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

//    @AfterTest
//    public void delCookie() {
//        log.info("Cookie was cleaned");
//        AndroidDriverCreator.getDriver().manage().deleteAllCookies();
//    }

    @AfterSuite
    public void afterSuit() {
        appiumServerJava.stopServer();
        log.info("Server STOP!!!");
    }
}
