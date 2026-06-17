package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshotutility {

    public static String captureScreenshot(WebDriver driver, String scenarioName) {

        String timestamp =
                new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        String filePath =
                "test-output/screenshots/" + scenarioName + "_" + timestamp + ".png";

        try {
            File src =
                    ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(src, new File(filePath));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return filePath;
    }
}
