package config;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactorySafari {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null) {
            createDriver();
        }
        return driver;
    }

    private static void createDriver() {
        driver = WebDriverManager.safaridriver().create();
        //SafariOptions safariOptions = new SafariOptions();
        //driver = new SafariDriver(safariOptions);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void killDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}