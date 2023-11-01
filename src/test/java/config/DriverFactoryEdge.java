package config;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactoryEdge {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null) {
            createDriver();
        }
        return driver;
    }

    private static void createDriver() {
        System.setProperty("webdriver.edge.driver", "src/drivers/edge/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void killDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

