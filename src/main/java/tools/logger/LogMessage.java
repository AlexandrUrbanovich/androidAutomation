package tools.logger;

import com.epam.reportportal.message.ReportPortalMessage;

import java.io.File;
import java.io.IOException;

public class LogMessage {

    public static String getMessageThatElementPresentOnPage(String pageName, String nameElement) {
        return String.format("Check that [%s] is present on [%s]", nameElement, pageName);
    }

    public static String getLogTest(String testName) {
        return String.format("Test [%s] started", testName);
    }

    public static ReportPortalMessage sendScreenShot(String path) {
        ReportPortalMessage message = null;
        try {
            String screenShotFile = path;
            String rpMessage = "Test message for report Portal";
            message = new ReportPortalMessage(new File(screenShotFile), rpMessage);
        } catch (IOException e){
            e.printStackTrace();
        }
        return message;
    }

}
