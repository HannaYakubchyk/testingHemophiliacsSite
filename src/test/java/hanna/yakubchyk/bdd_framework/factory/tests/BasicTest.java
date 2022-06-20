package hanna.yakubchyk.bdd_framework.factory.tests;

import hanna.yakubchyk.bdd_framework.driver.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


import static hanna.yakubchyk.bdd_framework.urls.HemophiliacsURLs.MAIN_PAGE_URL;

public class BasicTest {


    public static WebDriver getDriver(){
        return Driver.getDriver();
    }

    @BeforeClass(description = "Start browser")
    public void setUp() {
        WebDriver driver = getDriver();
        driver.get(MAIN_PAGE_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass()  {
        getDriver().quit();
    }

}
