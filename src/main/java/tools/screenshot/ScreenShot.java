package tools.screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static String  makeScreeShot(WebDriver webDriver){
        String path = null;
        File src = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        try {
            path = "D:\\Automation\\androidAutomation\\screenShots\\" + System.currentTimeMillis() + ".png";
            FileUtils.copyFile(src, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }
}
