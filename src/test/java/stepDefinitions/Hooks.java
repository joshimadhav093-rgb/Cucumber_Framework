package stepDefinitions;

import Utilities.Screenshotutility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("Browser started");
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            Screenshotutility.captureScreenshot(
                    driver,
                    scenario.getName().replace(" ", "_")
            );

            System.out.println("Screenshot captured for failed scenario");
        }

        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed");
        }
    }

}
