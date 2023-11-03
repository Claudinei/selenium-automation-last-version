package config;

import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class DriverChoice {

    public static String recuperaopcaoDriver() throws IOException {
        return Manipulador.getProp().getProperty("prop.server.navegador");
    }

    public static WebDriver escolhaDoDriver() throws IOException {

        switch (recuperaopcaoDriver()) {

            case "ChromeDriver":
                return DriverFactoryChrome.getDriver();
            case "EdgeDriver":
                return DriverFactoryEdge.getDriver();
            case "Geckodriver":
                return DriverFactoryFirefox.getDriver();
            case "Safaridriver":
                return DriverFactorySafari.getDriver();
        }
        return DriverFactoryChrome.getDriver();
    }

    public static void escolhaKillDriver() throws IOException {

        switch (recuperaopcaoDriver()) {

            case "ChromeDriver":
                DriverFactoryChrome.killDriver();
                break;
            case "EdgeDriver":
                DriverFactoryEdge.killDriver();
                break;
            case "Geckodriver":
                DriverFactoryFirefox.killDriver();
                break;
            case "Safaridriver":
                DriverFactorySafari.killDriver();
                break;
        }
    }
}