package config;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactoryChrome {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null) {
            createDriver();
        }
        return driver;
    }

    protected static void createDriver() {
       // System.setProperty("webdriver.chrome.driver", "src/drivers/chrome/chromedriver.exe");
        //driver = WebDriverManager.chromedriver().create();
        driver = WebDriverManager.edgedriver().create();
        final ChromeOptions chromeOptions = new ChromeOptions();
        //driver = new ChromeDriver(chromeOptions.addArguments("--headless"));
        chromeOptions.setHeadless(false);
        driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void killDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
