package tools;

public class LogMessage {

    public static String getMessageThatElementPresentOnPage(String pageName, String nameElement) {
        return String.format("Check that %s is present on %s", nameElement, pageName);
    }

}
