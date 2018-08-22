package tools.logger;

public class LogMessage {

    public static String getMessageThatElementPresentOnPage(String pageName, String nameElement) {
        return String.format("Check that [%s] is present on [%s]", nameElement, pageName);
    }

    public static String getLogTest(String testName) {
        return String.format("Test [%s] started", testName);
    }

}
