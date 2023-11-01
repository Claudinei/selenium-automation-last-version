package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactoryFirefox {

    private static WebDriver driver;

    public static WebDriver getDriver() throws MalformedURLException {
        if(driver == null) {
            createDriver();
        }
        return driver;
    }

    private static void createDriver() throws MalformedURLException {
        System.setProperty("webdriver.gecko.driver", "src/drivers/firefox/geckodriver.exe");
        final FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setHeadless(false);
        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void killDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
