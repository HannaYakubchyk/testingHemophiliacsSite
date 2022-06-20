package hanna.yakubchyk.bdd_framework.factory.pages;

import hanna.yakubchyk.bdd_framework.driver.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {

  private WebDriver getDriver() {
        return Driver.getDriver();
    }
    protected Page(){
        PageFactory.initElements(getDriver(), this);
    }
}
