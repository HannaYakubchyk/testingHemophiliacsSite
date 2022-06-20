package hanna.yakubchyk.bdd_framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            setChromeDriver();
        }
        return driver;
    }

    private static void setChromeDriver()
    {
        String exePath = "/Users/annayakubchik/IBA/Тестирование/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setJavascriptEnabled(true);
        driver = new ChromeDriver(capabilities);
    }
}
