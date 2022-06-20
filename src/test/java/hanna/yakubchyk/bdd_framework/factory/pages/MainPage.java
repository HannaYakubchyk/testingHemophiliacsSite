package hanna.yakubchyk.bdd_framework.factory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page {

    @FindBy(xpath = "//*[@id=\"top\"]/main/div/div/div[4]/div/div/div[2]/div[2]/a")
    private WebElement volButton;

    public void clickOnVolunteerButton(){
        volButton.click();
    }
}
